package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

import com.ara.exception.WeakKeyException;

public class VerifyKeyAspect {
	public void verify(JoinPoint jp, Object ret) {
		int key = 0;

		key = (Integer) ret;
		if (key <= 0) { // weak key
			throw new WeakKeyException("key generated is weak");
		}
	}
}
