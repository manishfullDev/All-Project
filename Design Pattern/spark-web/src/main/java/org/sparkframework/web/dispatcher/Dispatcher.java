package org.sparkframework.web.dispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sparkframework.web.exception.ViewRenderFailedException;
import org.sparkframework.web.metadata.SparkWebMetadataContext;

public class Dispatcher {
	public void dispatch(HttpServletRequest request, HttpServletResponse response, String requestURL, String outcome,
			SparkWebMetadataContext context) {
		String page = null;

		try {
			page = context.getPage(requestURL, outcome);
			request.getRequestDispatcher(page).forward(request, response);
		} catch (ServletException | IOException e) {
			throw new ViewRenderFailedException("failed in displaying view", e);
		}
	}
}
