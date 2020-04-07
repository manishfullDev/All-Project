package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.advice.GlobalExceptionLoggingAdvice;
import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new GlobalExceptionLoggingAdvice());
		Thrower proxy = (Thrower) pf.getProxy();
		int i = proxy.willThrow(-10);
		System.out.println("i : " + i);
	}
}
