package com.jee5.config.handler;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import com.jee5.servlet.PingServlet;

public class PingServletConfigHandlerImpl implements ConfigHandler {

	@Override
	public void configuration(ServletContext servletContext) {
		ServletRegistration.Dynamic dynamic = null;
		PingServlet pingServlet = null;
		
		System.out.println("configuring ping servlet");
		
		pingServlet = new PingServlet();
		dynamic = servletContext.addServlet("ping", pingServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/ping");
	}

}
