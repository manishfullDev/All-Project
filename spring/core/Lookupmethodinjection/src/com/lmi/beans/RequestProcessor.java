package com.lmi.beans;

public class RequestProcessor {
	private String data;

	public void process() throws InterruptedException {
		Thread.sleep(1000L);
		System.out.println("Processing Thread : " + Thread.currentThread().getName() + " with data : " + data);
	}

	public void setData(String data) {
		this.data = data;
	}

}
