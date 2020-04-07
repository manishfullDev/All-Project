package com.sha.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sha.config.RootConfig;
import com.sha.entities.Company;
import com.sha.service.CompanyService;

public class SHATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		CompanyService cs = context.getBean("companyService", CompanyService.class);
		
		Company company = cs.getCompany(1);
		System.out.println(company);
	}
}
