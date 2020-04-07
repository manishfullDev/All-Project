package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ara.beans.KeyGenerator;
import com.ara.config.ARAConfig;

public class ARATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ARAConfig.class);
		KeyGenerator kg = context.getBean("keyGenerator", KeyGenerator.class);
		kg.generateKey(2);
	}
}
