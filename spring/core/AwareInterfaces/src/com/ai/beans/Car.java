package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	private BeanFactory beanFactory;

	public void drive(String engineType) {
		boolean flag = false;
		IEngine engine = null;
		
		engine = beanFactory.getBean(engineType, IEngine.class);
		flag = engine.start();
		if (flag) {
			engine.accelerate();
		}
		System.out.println("driving....");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
