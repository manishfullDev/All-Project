package com.jcpi.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PIJavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PIJavaConfig.class);
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio);

	}
}
