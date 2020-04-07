package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.advice.CacheAdvice;
import com.aa.beans.Calculator;

public class CacheTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new CacheAdvice());

		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);
		
		
		sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);
	}
}










