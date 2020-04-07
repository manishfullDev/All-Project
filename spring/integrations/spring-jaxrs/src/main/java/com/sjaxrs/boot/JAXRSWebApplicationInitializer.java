package com.sjaxrs.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.sjaxrs.config.RootConfig;

public class JAXRSWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootApplicationContext = null;
		ContextLoaderListener listener = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);

		listener = new ContextLoaderListener(rootApplicationContext);
		servletContext.addListener(listener);
	}
}
