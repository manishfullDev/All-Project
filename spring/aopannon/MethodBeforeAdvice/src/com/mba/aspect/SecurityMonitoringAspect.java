package com.mba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mba.helper.SecurityHelper;

@Component
@Aspect
public class SecurityMonitoringAspect {
	@Autowired
	private SecurityHelper securityHelper;

	@Pointcut("within(com.mba.beans.*)")
	public void commonPointcut() {

	}

	@Before("commonPointcut()")
	public void audit(JoinPoint jp) {
		System.out.println(securityHelper.getLoggedInUser() + " called method : " + jp.getSignature().getName());
	}

	@Before("commonPointcut()")
	public void checkSecurity() throws IllegalAccessException {
		if (securityHelper.authenticate() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}

}
