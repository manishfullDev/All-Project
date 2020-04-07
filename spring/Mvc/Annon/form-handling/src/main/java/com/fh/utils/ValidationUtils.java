package com.fh.utils;

public class ValidationUtils {
	public static boolean isEmpty(String s) {
		if (s == null || s.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
