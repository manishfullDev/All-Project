package com.hi.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MaintainanceCheckHandlerInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = true;
		Calendar today = null;
		int hours = 0;

		today = Calendar.getInstance();
		hours = today.get(Calendar.HOUR_OF_DAY);
		if (hours >= 20 && hours <= 21) {
			response.sendRedirect("maintainance.jsp");
			flag = false;
		}

		return flag;
	}
}
