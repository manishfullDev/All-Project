package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

import com.ta.exception.InvalidArgumentException;

public class GlobalExceptionLoggingAspect {
	public void logException(JoinPoint jp, InvalidArgumentException e) {
		System.out.println("exception thrown by method : " + jp.getSignature() + " with message : " + e.getMessage());
	}
}
