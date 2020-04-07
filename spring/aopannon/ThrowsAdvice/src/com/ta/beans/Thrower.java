package com.ta.beans;

import org.springframework.stereotype.Component;

@Component
public class Thrower {
	public int willThrow(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("invalid i");
		}
		return i;
	}
}
