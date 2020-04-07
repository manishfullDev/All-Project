package com.df.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpenAccountServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String accountNo = null;
		String accountType = null;
		String accountHolderName = null;

		accountHolderName = req.getParameter("accountHolderName");
		accountType = req.getParameter("accountType");
		accountNo = UUID.randomUUID().toString();
		
		req.setAttribute("accountNo", accountNo);
		req.setAttribute("accountHolderName", accountHolderName);
		req.setAttribute("accountType", accountType);

		req.getRequestDispatcher("/account.jsp").forward(req, resp);
	}

}
