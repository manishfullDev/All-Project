package com.dj.launcher;

import com.dj.utils.ArrayUtils;

public class UtilsTest {
	public static void main(String[] args) {
		ArrayUtils arrayUtils = new ArrayUtils();
		int[] in = new int[] { 10, 3, 6, 1 };
		long sum = arrayUtils.sumOfElements(in);
		System.out.println("sum : " + sum);
	}
}
