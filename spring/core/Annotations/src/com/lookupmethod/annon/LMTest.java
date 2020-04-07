package com.lookupmethod.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LMTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext("com.lookupmethod.annon");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(LMConfig.class);
		Container container = context.getBean("container", Container.class);
		container.receive("data");
	}
}
