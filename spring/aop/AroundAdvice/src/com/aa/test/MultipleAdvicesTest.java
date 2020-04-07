package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.advice.CacheAdvice;
import com.aa.advice.LoggingAdvice;
import com.aa.beans.Calculator;

public class MultipleAdvicesTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		
		pf.addAdvice(new CacheAdvice());
		pf.addAdvice(new LoggingAdvice());
		
		
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);
		
		sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);
		
		
	}
}
















