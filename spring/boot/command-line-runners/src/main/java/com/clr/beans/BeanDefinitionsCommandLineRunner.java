package com.clr.beans;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanDefinitionsCommandLineRunner implements CommandLineRunner, ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Override
	public void run(String... args) throws Exception {
		String[] beanNames = null;
		beanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
