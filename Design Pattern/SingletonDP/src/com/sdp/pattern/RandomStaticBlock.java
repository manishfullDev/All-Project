package com.sdp.pattern;

public class RandomStaticBlock {
	private static RandomStaticBlock instance;

	static {
		instance = new RandomStaticBlock();
	}

	private RandomStaticBlock() {
		System.out.println("RandomStaticBlock() instantiated");
	}

	public static RandomStaticBlock getInstance() {
		return instance;
	}
}
