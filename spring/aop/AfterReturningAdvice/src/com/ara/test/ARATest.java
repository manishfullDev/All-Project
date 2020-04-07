package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.advice.ValidateKeyAdvice;
import com.ara.beans.KeyGenerator;

public class ARATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new KeyGenerator());
		pf.addAdvice(new ValidateKeyAdvice());
		
		KeyGenerator proxy = (KeyGenerator) pf.getProxy();
		int key = proxy.generateKey(18);
		System.out.println("key : " + key);
		key = proxy.generateKey(15);
		System.out.println("key : " + key);
	}
}




















