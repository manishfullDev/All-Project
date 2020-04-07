package com.ara.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ValidateKeyAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args, Object target) throws Throwable {
		if ((Integer) ret <= 0) { // weak key
			throw new IllegalArgumentException("Weak key generated");
		}
	}

}
