package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.helper.SecurityHelper;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mba/common/application-context.xml");
		SecurityHelper securityHelper = context.getBean("securityHelper", SecurityHelper.class);
		securityHelper.login("john", "welcome1");
		
		LoanManager loanManager = context.getBean("loanManager", LoanManager.class);
		boolean flag = loanManager.approveLoan("l303");
		System.out.println("approved ? : " + flag);
		securityHelper.logout();
	}
}
