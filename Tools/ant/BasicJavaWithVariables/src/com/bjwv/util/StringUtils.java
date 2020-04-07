package com.bjwv.util;

public class StringUtils {
	public String reverse(String in) {
		StringBuilder ni = null;

		ni = new StringBuilder();
		for (int i = in.length() - 1; i >= 0; i--) {
			ni.append(in.charAt(i));
		}
		return ni.toString();
	}
}
