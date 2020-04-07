package com.fma.boot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fma.config.RootConfig;
import com.fma.config.WebMvcConfig;

public class FMAWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext servletApplicationContext = null;
		AnnotationConfigWebApplicationContext rootApplicationContext = null;
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;
		ServletRegistration.Dynamic dynamic = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);

		contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
		servletContext.addListener(contextLoaderListener);

		servletApplicationContext = new AnnotationConfigWebApplicationContext();
		servletApplicationContext.register(WebMvcConfig.class);

		dispatcherServlet = new DispatcherServlet(servletApplicationContext);
		dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");
	}
}
