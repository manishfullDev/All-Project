package com.req.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/req/annon/req-beans.xml");
		FuelTank fuelTank = context.getBean("fuelTank", FuelTank.class);
		System.out.println(fuelTank);
	}
}
