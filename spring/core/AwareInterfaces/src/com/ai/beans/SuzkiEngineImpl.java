package com.ai.beans;

public class SuzkiEngineImpl implements IEngine {

	@Override
	public boolean start() {
		System.out.println("Suzki engine not started");
		return false;
	}

	@Override
	public float accelerate() {
		System.out.println("Cannot accelerate, because Suzki engine not started");
		return 0;
	}

}
