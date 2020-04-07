package com.jcautowire.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JCAutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JCAutowireConfig.class);
		Remote remote = context.getBean("remote", Remote.class);
		remote.on();
	}
}
