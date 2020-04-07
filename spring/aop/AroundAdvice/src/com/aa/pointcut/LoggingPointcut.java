package com.aa.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.aa.beans.Calculator;

public class LoggingPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType) {
		if (method.getName().equals("add") && classType.isAssignableFrom(Calculator.class)) {
			return true;
		}
		return false;
	}

}
