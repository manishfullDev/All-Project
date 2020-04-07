package com.boot.exitcodes.beans;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Motor {
	public void start() {
		System.out.println("motor is starting..");
	}

	/*
	 * @PreDestroy public void release() throws Exception {
	 * System.out.println("release"); throw new
	 * Exception("failed in releasing resources"); }
	 */
}
