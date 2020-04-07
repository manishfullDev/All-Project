package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.helper.SecurityHelper;

public class SecurityMonitoringAspect {
	private SecurityHelper securityHelper;

	public void audit(JoinPoint jp) {
		String methodName = null;
		Object[] args = null;

		methodName = jp.getSignature().getName();
		args = jp.getArgs();

		System.out.print(securityHelper.getLoggedInUser() + " called method " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
	}

	public void securityCheck() throws IllegalAccessException {
		if (securityHelper.authenticate() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}

	public void setSecurityHelper(SecurityHelper securityHelper) {
		this.securityHelper = securityHelper;
	}

}
