package com.dj.utils;

public class ArrayUtils {
	public long sumOfElements(int[] in) {
		long sum = 0;
		for (int i = 0; i < in.length; i++) {
			sum += in[i];
		}
		return sum;
	}
}
