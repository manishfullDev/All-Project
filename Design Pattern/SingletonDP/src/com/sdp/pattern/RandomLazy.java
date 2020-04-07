package com.sdp.pattern;

public class RandomLazy {
	private static RandomLazy instance;

	private RandomLazy() {
		System.out.println("RandomLazy() instantiated..");
	}

	public static RandomLazy getInstance() {
		if (instance == null) {
			instance = new RandomLazy();
		}
		return instance;
	}
}
