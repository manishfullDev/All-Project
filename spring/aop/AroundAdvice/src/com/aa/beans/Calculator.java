package com.aa.beans;

public class Calculator {
	public int add(int a, int b) {
		System.out.println("in add(a, b)");
		return a + b;
	}

	public int substract(int a, int b) {
		System.out.println("in substract(a, b)");
		return b - a;
	}
}
