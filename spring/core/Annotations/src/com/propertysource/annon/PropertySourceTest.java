package com.propertysource.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.propertysource.annon");
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
	}
}
