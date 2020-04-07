package com.decorator.dth.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.decorator.dth.bo.Subscription;
import com.decorator.dth.packages.Package;
import com.decorator.dth.packages.factory.DTHPackageFactory;

@WebServlet(urlPatterns = { "/showPackageDetails" })
public class ChooseDTHPackageServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String packageName = null;
		String[] topups = null;
		Subscription subscription = null;
		Package dthPackage = null;

		packageName = req.getParameter("package");
		topups = req.getParameterValues("topup");
		dthPackage = DTHPackageFactory.getPackage(packageName, topups);

		subscription = new Subscription(packageName, Arrays.asList(topups), dthPackage.getChannels(),
				dthPackage.getSubscriptionAmount(), dthPackage.getValidityDays());
		req.setAttribute("subscription", subscription);
		req.getRequestDispatcher("/package-details.jsp").forward(req, resp);
	}
}
















