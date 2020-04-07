package com.jcsa.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JCSATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JCSAConfig.class);
		Letter letter = context.getBean("letter", Letter.class);
		System.out.println(letter);
	}
}
