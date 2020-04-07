package com.lmi.worker;

import org.springframework.beans.factory.BeanFactory;

import com.lmi.beans.Container;

public class Worker extends Thread {
	private String data;
	private BeanFactory factory;

	public Worker(String data, BeanFactory factory) {
		this.data = data;
		this.factory = factory;
	}

	public void run() {
		Container container = null;
		container = factory.getBean("container", Container.class);
		try {
			container.acceptRequest(data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
