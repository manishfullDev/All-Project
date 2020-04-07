package com.bbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bbs.beans.Robot;

@SpringBootApplication
public class BBSTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBSTest.class, args);
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
