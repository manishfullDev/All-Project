package com.ej.launcher;

import com.ej.utils.MathUtil;

public class UtilsTest {
	public static void main(String[] args) {
		MathUtil mathUtil = new MathUtil();
		boolean flag = mathUtil.isAmstrong(Integer.parseInt(args[0]));
		System.out.println(args[0] + " is amstrong : " + flag);
	}
}
