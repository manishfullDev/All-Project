package com.ara.beans;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {
	public int generateKey(int len) {
		if (len < 16) {
			return 0;
		}
		return 1;
	}
}
