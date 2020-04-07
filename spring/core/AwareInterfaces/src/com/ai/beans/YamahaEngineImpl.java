package com.ai.beans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public boolean start() {
		System.out.println("Yamaha engine started...");
		return true;
	}

	@Override
	public float accelerate() {
		System.out.println("Accelerating Yamaha engine....");
		return 100;
	}

}
