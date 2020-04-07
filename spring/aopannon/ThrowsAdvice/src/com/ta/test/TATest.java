package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ta.beans.Thrower;
import com.ta.config.TAConfig;

public class TATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TAConfig.class);
		Thrower t = context.getBean("thrower", Thrower.class);
		t.willThrow(-1);
	}
}
