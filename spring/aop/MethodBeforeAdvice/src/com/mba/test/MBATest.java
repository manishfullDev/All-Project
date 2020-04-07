package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.advice.AuditAdvice;
import com.mba.advice.SecurityCheckAdvice;
import com.mba.beans.LoanManager;
import com.mba.security.beans.SecurityHelper;

public class MBATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new AuditAdvice());
		pf.addAdvice(new SecurityCheckAdvice());

		LoanManager proxy = (LoanManager) pf.getProxy();
		SecurityHelper securityHelper = SecurityHelper.getInstance();
		securityHelper.login("john", "welcome1");
		
		boolean approve = proxy.approveLoan("L93kdk");
		securityHelper.logout();
		System.out.println("approve  ? : " + approve);
	}
}




















