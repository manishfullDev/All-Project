package com.lookupmethod.annon;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.lookupmethod.annon" })
public class LMConfig implements ApplicationContextAware {
	private ApplicationContext context;

	@Bean
	public Container container() {
		return new Container() {
			@Override
			public RequestProcessor lookupRequestProcessor() {
				return context.getBean("requestProcessor", RequestProcessor.class);
			}
		};
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
