package com.sji.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sji.config.RootConfig;
import com.sji.entities.Company;
import com.sji.service.CompanyService;

import org.springframework.context.ApplicationContext;

public class SJITest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		CompanyService cs = context.getBean("companyService", CompanyService.class);
		Company company = cs.getCompany(1);
		System.out.println(company);
	}
}
