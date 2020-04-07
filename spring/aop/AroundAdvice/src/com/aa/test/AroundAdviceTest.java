package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.advice.LoggingAdvice;
import com.aa.beans.Calculator;
import com.aa.pointcut.DynaLoggingPointcut;
import com.aa.pointcut.LoggingPointcut;

public class AroundAdviceTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		// pf.addAdvice(new LoggingAdvice());
		pf.addAdvisor(new DefaultPointcutAdvisor(new DynaLoggingPointcut(), new LoggingAdvice()));

		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(100, 200);
		System.out.println("sum : " + sum);

		int substract = proxy.substract(10, 20);
		System.out.println("substract : " + substract);
	}
}
