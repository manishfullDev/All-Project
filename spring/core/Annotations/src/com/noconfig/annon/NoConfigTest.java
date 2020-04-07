package com.noconfig.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.noconfig.annon");
		Car car = context.getBean("car", Car.class);
		car.drive();
	}
}
