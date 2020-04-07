package com.ej.utils;

public class MathUtil {
	public boolean isAmstrong(int n) {
		boolean flag = false;
		int d = 0;
		int r = 0;
		int amstrong = 0;

		d = n;
		while (d > 0) {
			r = d % 10;
			amstrong += Math.pow(r, 3);
			d = d / 10;
		}
		if (amstrong == n) {
			flag = true;
		}
		return flag;
	}
}
