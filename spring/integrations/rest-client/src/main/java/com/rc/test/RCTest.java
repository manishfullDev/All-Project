package com.rc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rc.config.RootConfig;
import com.rc.dto.Account;
import com.rc.dto.User;
import com.rc.service.PayTMWalletService;

public class RCTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		PayTMWalletService service=  context.getBean("payTMWalletService", PayTMWalletService.class);
		/*
		 * String balance = service.getBalance("93839"); System.out.println(balance);
		 */
		Account account = null;
		User user = new User();
		user.setFirstName("Susan");
		user.setLastName("K");
		user.setAge(32);
		user.setGender("Female");
		user.setMobileNo("03830984");
		user.setEmailAddress("susan@gmail.com");
		account = service.openAccount(user);
		System.out.println(account);
		
	}
}













