package com.bbpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bbpp.beans.BiCycle;

@SpringBootApplication
public class BBPPTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBPPTest.class, args);
		BiCycle biCycle = context.getBean("biCycle", BiCycle.class);
		biCycle.ride();
	}
}
