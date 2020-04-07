package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.ara.exception.WeakKeyException;

@Component
@Aspect
public class VerifyKeyAspect {

	@AfterReturning(value = "within(com.ara.beans.*)", returning = "ret")
	public void verify(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 0) {
			throw new WeakKeyException("weak key");
		}
	}
}
