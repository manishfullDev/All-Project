package com.mba.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.security.beans.SecurityHelper;

public class AuditAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		SecurityHelper securityHelper = null;
		String methodName = null;
		boolean isFirst = true;

		if (args[0] == null || ((String) args[0]).trim().length() == 0) {
			throw new IllegalArgumentException("Invalid loanNumber");
		}

		securityHelper = SecurityHelper.getInstance();
		methodName = method.getName();
		System.out.print(securityHelper.getLoggedInUser() + " called method : " + methodName + "(");
		for (Object arg : args) {
			if (isFirst) {
				System.out.print(arg);
				isFirst = false;
				continue;
			}
			System.out.print("," + arg);
		}
		System.out.println(")");
		args[0] = "A-" + args[0];

	}

}
