package com.palindrome.beans;

public class StringHelper {
	public boolean isPalindrome(String s) {
		boolean flag = true;
		int len = 0;

		if (s == null || s.trim().length() == 0) {
			flag = false;
		} else {
			len = s.length();
			for (int i = 0; i < len / 2; i++) {
				if (s.charAt(i) != s.charAt((len - i - 1))) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}
}
