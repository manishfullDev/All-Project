package com.dps.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DPSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DPSJConfig.class);

	}
}
