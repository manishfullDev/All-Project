package com.stereotype.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SteretypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/annon/stereotype-beans.xml");

		Chatbox cb1 = context.getBean("messageBox", Chatbox.class);
		Chatbox cb2 = context.getBean("messageBox", Chatbox.class);

		System.out.println("cb1 == cb2 ? : " + (cb1 == cb2));
	}
}
