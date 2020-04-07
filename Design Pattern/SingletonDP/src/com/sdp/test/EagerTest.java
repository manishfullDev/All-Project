package com.sdp.test;

import com.sdp.pattern.RandomEager;

public class EagerTest {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * RandomEager randomEager1 = RandomEager.getInstance(); RandomEager
		 * randomEager2 = RandomEager.getInstance();
		 * 
		 * System.out.println("randomeager1 == randomeager2 ? : " + (randomEager1 ==
		 * randomEager2));
		 */
		Class.forName("com.sdp.pattern.RandomEager");

	}
}
