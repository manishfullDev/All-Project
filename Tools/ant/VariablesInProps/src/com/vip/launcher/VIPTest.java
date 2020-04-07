package com.vip.launcher;

import com.vip.utils.ArrayUtils;

public class VIPTest {
	public static void main(String[] args) {
		ArrayUtils arrayUtils = new ArrayUtils();
		int[] in = new int[] { 10, 2, 12, 12, 3, 10, 2, 1, 14, 2 };
		// 10, 2, 12, 3, 1, 14
		int out[] = arrayUtils.removeDuplicates(in);
		for (int i : out) {
			System.out.print(i + " ");
		}

	}
}
