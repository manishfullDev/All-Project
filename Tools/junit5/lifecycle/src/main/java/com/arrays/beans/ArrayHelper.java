package com.arrays.beans;

import com.arrays.exception.EmptyArrayException;

public class ArrayHelper {
	public int[] sort(int[] in) {
		int[] cin = null;

		if (in == null || in.length == 0) {
			throw new EmptyArrayException("array is empty");
		}

		cin = in.clone();
		for (int i = 0; i < cin.length - 1; i++) {
			for (int j = 0; j < (cin.length - i - 1); j++) {
				if (cin[j] > cin[j + 1]) {
					int t = cin[j];
					cin[j] = cin[j + 1];
					cin[j + 1] = t;
				}
			}
		}
		return cin;
	}
}
