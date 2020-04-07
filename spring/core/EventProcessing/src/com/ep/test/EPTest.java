package com.ep.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.EditCityController;

import org.springframework.context.ApplicationContext;

public class EPTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ep/common/application-context.xml");
		EditCityController ecc = context.getBean("editCityController", EditCityController.class);
		ecc.updateCity(1, "Chennai");
	}
}
