package com.singleton.test;

import com.singleton.pattern.Random;

public class SingletonTest {
	public static void main(String[] args) {
		Random random1 = Random.createRandom();
		Random random2 = Random.createRandom();

		System.out.println("random1 : " + random1.hashCode() + " random2 : " + random2.hashCode());
	}
}
