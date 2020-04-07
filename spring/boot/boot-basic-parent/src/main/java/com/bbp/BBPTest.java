package com.bbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bbp.beans.Robot;

@SpringBootApplication
public class BBPTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBPTest.class, args);
		Robot robot = context.getBean("robot", Robot.class);
		robot.tee();
	}
}
