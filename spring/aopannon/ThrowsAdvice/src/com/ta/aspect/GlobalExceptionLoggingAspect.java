package com.ta.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GlobalExceptionLoggingAspect {
	@AfterThrowing(value = "within(com.ta.beans.*)", throwing = "e")
	public void logException(JoinPoint jp, IllegalArgumentException e) {
		System.out.println(
				"exception reported by method : " + jp.getSignature().getName() + " with message : " + e.getMessage());
	}
}
