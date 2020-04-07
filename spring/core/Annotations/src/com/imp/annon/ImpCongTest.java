package com.imp.annon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;

public class ImpCongTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		Product product = context.getBean("product", Product.class);
		System.out.println(product);
	}
}
