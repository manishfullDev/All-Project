package com.importresource.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportResourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportResourceConfig.class);
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);
	}
}
