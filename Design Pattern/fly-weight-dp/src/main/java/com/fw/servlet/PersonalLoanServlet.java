package com.fw.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fw.bo.Applicant;
import com.fw.bo.LoanDocument;
import com.fw.helper.AppFactory;
import com.fw.service.PersonalLoanService;

@WebServlet(urlPatterns = { "/personalLoan" })
public class PersonalLoanServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Applicant applicant = null;
		AppFactory appFactory = null;
		LoanDocument document = null;
		PersonalLoanService personalLoanService = null;
		SimpleDateFormat sdf = null;

		try {
			sdf = new SimpleDateFormat("dd/mm/yyyy");
			appFactory = AppFactory.getInstance("beans.properties");
			personalLoanService = (PersonalLoanService) appFactory.getObject("personalLoanService");

			document = new LoanDocument();
			document.setLoanType("personal");
			document.setLoanAmount(Double.parseDouble(req.getParameter("loanAmount")));
			document.setInterestRate(Double.parseDouble(req.getParameter("interestRate")));
			document.setTenureInMonths(Integer.parseInt(req.getParameter("tenure")));
			document.setPurpose(req.getParameter("purpose"));

			applicant = new Applicant();
			applicant.setApplicantName(req.getParameter("applicantName"));
			applicant.setDob(sdf.parse(req.getParameter("dob")));
			applicant.setEmailAddress(req.getParameter("emailAddress"));
			applicant.setGender(req.getParameter("gender"));
			applicant.setMobileNo(req.getParameter("mobileNo"));

			String loanNo = personalLoanService.applyLoan(document, applicant);
			req.setAttribute("loanNo", loanNo);
			req.getRequestDispatcher("/loan-application-details.jsp").forward(req, resp);

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | ParseException e) {
			throw new ServletException(e);
		}

	}
}
