package com.fma.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMvcConfig {

	@Bean
	public HandlerMapping handlerMapping() {
		SimpleUrlHandlerMapping handlerMapping = null;
		Properties mappings = null;

		mappings = new Properties();
		mappings.put("/welcome-annon.htm", "viewWelcomeAnnonController");

		handlerMapping = new SimpleUrlHandlerMapping();
		handlerMapping.setMappings(mappings);

		return handlerMapping;
	}

	@Bean
	public Controller viewWelcomeAnnonController() {
		ParameterizableViewController parameterizableViewController = null;

		parameterizableViewController = new ParameterizableViewController();
		parameterizableViewController.setViewName("welcome-annon");

		return parameterizableViewController;
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = null;

		viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

}
