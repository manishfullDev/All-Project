package com.jcautowire.annon;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JCAutowireConfig implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Bean
	public Toy toy() {
		Toy toy = new Toy();
		return toy;
	}

	@Bean
	public Toy automaticToy() {
		Toy toy = new Toy();
		return toy;
	}

	@Bean
	public Remote remote() {
		Toy toy = null;

		toy = applicationContext.getBean("toy", Toy.class);
		Remote remote = new Remote(toy);
		return remote;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
