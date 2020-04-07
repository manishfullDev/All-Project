package com.async.servlet;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetStockServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long waitingTime = Long.parseLong(req.getParameter("wait"));
		AsyncContext asyncContext = req.startAsync();

		Runnable r = () -> {
			double price = longRunningProcess(waitingTime);
			ServletResponse response = asyncContext.getResponse();
			try {
				response.getWriter().print("price : " + price);
				asyncContext.complete();
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		new Thread(r).start();

		/*
		 * double price = longRunningProcess(waitingTime);
		 * resp.getWriter().print("price : " + price);
		 */
	}

	private double longRunningProcess(long waitTime) {
		// doing a service invocation to the external service and waiting for the
		// response
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 243.3;
	}
}
