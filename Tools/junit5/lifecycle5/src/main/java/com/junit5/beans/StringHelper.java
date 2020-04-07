package com.junit5.beans;

import com.junit5.exception.EmptyStringException;

public class StringHelper {
	public String reverse(String in) {
		StringBuffer buffer = null;
		if (in == null || in.trim().length() == 0) {
			throw new EmptyStringException("input string is empty");
		}
		buffer = new StringBuffer();
		for (int i = in.length() - 1; i >= 0; i--) {
			buffer.append(in.charAt(i));
		}
		return buffer.toString();
	}
}
