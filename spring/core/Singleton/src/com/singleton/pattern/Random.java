package com.singleton.pattern;

public class Random {
	private static Random instance;

	private Random() {
	}

	public static Random createRandom() {
		if (instance == null) {
			instance = new Random();
			return instance;
		} else {
			return instance;
		}
	}
}
