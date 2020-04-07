package com.javaconfig.annon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean(name = { "sportsBike", "bike", "raceBike" })
	@Scope("prototype")
	@Lazy
	public Bike bike() {
		Bike bike = null;

		System.out.println("bike()");
		bike = new Bike();
		return bike;
	}
}
