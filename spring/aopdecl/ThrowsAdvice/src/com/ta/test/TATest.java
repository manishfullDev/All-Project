package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ta/common/application-context.xml");
		Thrower thrower = context.getBean("thrower", Thrower.class);
		int i = thrower.willThrow(-1);
		System.out.println("i : " + i);

	}
}
