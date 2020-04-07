package com.df.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTokenizerFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = null;
		HttpServletResponse httpResponse = null;
		HttpSession httpSession = null;
		String sToken = null;
		String cToken = null;
		String token = null;
		String requestMethod = null;

		httpRequest = (HttpServletRequest) request;
		httpResponse = (HttpServletResponse) response;

		httpSession = httpRequest.getSession(false);

		if (httpSession != null) {
			requestMethod = httpRequest.getMethod();
			if (requestMethod.equalsIgnoreCase("POST")) {
				cToken = httpRequest.getParameter("cToken");
				sToken = (String) httpSession.getAttribute("sToken");
				if (cToken.equals(sToken) == false) {
					httpRequest.getRequestDispatcher("/dup-error.jsp").forward(request, response);
					return;
				}
			}
		}
		httpSession = httpRequest.getSession();
		token = UUID.randomUUID().toString();
		httpRequest.setAttribute("cToken", token);
		httpSession.setAttribute("sToken", token);
		chain.doFilter(request, response);
	}

}















