package com.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.beans.Robot;
import com.di.config.JavaConfig;

public class DITest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
