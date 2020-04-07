package com.sdp.test;

import com.sdp.pattern.RandomLazy;

public class LazyTest {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * RandomLazy randomLazy1 = RandomLazy.getInstance(); RandomLazy randomLazy2 =
		 * RandomLazy.getInstance();
		 * 
		 * System.out.println("lazy1 == lazy2 ? : " + (randomLazy1 == randomLazy2));
		 */
		Class.forName("com.sdp.pattern.RandomLazy");
		System.out.println("exit...");
	}
}
