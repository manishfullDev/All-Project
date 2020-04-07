package com.boot.web;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;

import com.boot.web.servlet.PingServlet;

@SpringBootApplication
public class BootWebJdbcApplication extends SpringBootServletInitializer {
	@Bean
	public ServletRegistrationBean<PingServlet> pingServlet() {
		ServletRegistrationBean<PingServlet> registrationBean = new ServletRegistrationBean<>();
		registrationBean.setServlet(new PingServlet());
		registrationBean.setUrlMappings(Arrays.asList(new String[] { "/ping" }));
		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootWebJdbcApplication.class, args);
	}

	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return super.run(application);
	}

}
