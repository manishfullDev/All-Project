package com.blm.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Transmitter implements InitializingBean, DisposableBean {
	private int frequency;
	private int signalStrength;
	private double alpha;

	public void init() {
		System.out.println("post construction has been applied");
		this.alpha = (this.frequency * this.signalStrength) / 100;
	}

	public void clean() {
		this.alpha = 0;
		System.out.println("object destruction has been initialized");
	}
	

	@Override
	public void destroy() throws Exception {
		this.alpha = 0;
		System.out.println("object destruction has been initialized");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("post construction has been applied");
		this.alpha = (this.frequency * this.signalStrength) / 100;		
	}

	public Transmitter(int frequency) {
		this.frequency = frequency;
	}

	public void setSignalStrength(int signalStrength) {
		this.signalStrength = signalStrength;
	}

	public boolean open(String destination) {
		System.out.println("open with alpha : " + alpha);
		return true;
	}
}
