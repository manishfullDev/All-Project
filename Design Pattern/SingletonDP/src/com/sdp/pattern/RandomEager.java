package com.sdp.pattern;

public class RandomEager {
	private static RandomEager instance = new RandomEager();

	private RandomEager() {
		System.out.println("RandomEager() instantiated");
	}

	public static RandomEager getInstance() {
		return instance;
	}

}
