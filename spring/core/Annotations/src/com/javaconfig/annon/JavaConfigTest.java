package com.javaconfig.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		/*
		 * Bike bike1 = context.getBean("sportsBike", Bike.class); Bike bike2 =
		 * context.getBean("raceBike", Bike.class);
		 */
		/*
		 * String[] aliases = context.getAliases("bike"); for(String alias :aliases) {
		 * System.out.println(alias); }
		 */
		/* System.out.println("bike1 == bike2 : " + (bike1==bike2)); */
	}
}
