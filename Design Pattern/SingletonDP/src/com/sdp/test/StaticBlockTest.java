package com.sdp.test;

import com.sdp.pattern.RandomStaticBlock;

public class StaticBlockTest {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * RandomStaticBlock randomStaticBlock1 = RandomStaticBlock.getInstance();
		 * RandomStaticBlock randomStaticBlock2 = RandomStaticBlock.getInstance();
		 * System.out.println("static1 == static2 ? : " + (randomStaticBlock1 ==
		 * randomStaticBlock2));
		 */
		Class.forName("com.sdp.pattern.RandomStaticBlock");
	}
}
