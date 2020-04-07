package com.aa.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.aa.beans.Calculator;

public class DynaLoggingPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType, Object... args) {
		if (method.getName().equals("add") && classType.isAssignableFrom(Calculator.class)) {
			int a = (Integer) args[0];
			int b = (Integer) args[1];
			if (a >= 100 && b >= 100) {
				return true;
			}
		}
		return false;
	}

}
