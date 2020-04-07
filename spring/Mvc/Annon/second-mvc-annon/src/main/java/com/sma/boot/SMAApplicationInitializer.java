package com.sma.boot;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.sma.config.RootConfig;
import com.sma.config.WebMvcConfig;

public class SMAApplicationInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext servletApplicationContext = null;

		servletApplicationContext = new AnnotationConfigWebApplicationContext();
		servletApplicationContext.register(WebMvcConfig.class);

		return servletApplicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootApplicationContext = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);

		return rootApplicationContext;
	}

}
