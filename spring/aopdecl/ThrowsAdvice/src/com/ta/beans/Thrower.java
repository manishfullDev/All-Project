package com.ta.beans;

import com.ta.exception.InvalidArgumentException;

public class Thrower {
	public int willThrow(int i) {
		if (i <= 0) {
			throw new InvalidArgumentException("invalid i");
		}
		return i;
	}
}
