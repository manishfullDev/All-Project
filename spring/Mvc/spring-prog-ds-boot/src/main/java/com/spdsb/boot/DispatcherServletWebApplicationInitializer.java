package com.spdsb.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext servletApplicationContext = null;
		ServletRegistration.Dynamic dynamic = null;
		DispatcherServlet dispatcherServlet = null;

		servletApplicationContext = new XmlWebApplicationContext();
		servletApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");

		dispatcherServlet = new DispatcherServlet(servletApplicationContext);
		dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");
	}
}
