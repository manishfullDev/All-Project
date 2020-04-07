package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.config.AopConfig;
import com.mba.helper.SecurityHelper;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		LoanManager lm = context.getBean("loanManager", LoanManager.class);
		SecurityHelper sh = context.getBean("securityHelper", SecurityHelper.class);
		sh.login("john", "welcome1");
		boolean flag = lm.approveLoan("3930");
		System.out.println("flag  : " + flag);
		sh.logout();
	}
}
