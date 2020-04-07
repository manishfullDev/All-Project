package com.bjwv.runner;

import com.bjwv.util.StringUtils;

public class UtilTest {
	public static void main(String[] args) {
		StringUtils stringUtils = null;
		stringUtils = new StringUtils();
		String r = stringUtils.reverse("java");
		System.out.println(r);
	}
}
