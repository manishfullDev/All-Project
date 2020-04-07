package com.shi.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shi.entities.Company;
import com.shi.service.CompanyService;

public class SHITest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shi/common/application-context.xml");
		CompanyService companyService = context.getBean("companyService", CompanyService.class);
		/*
		 * Company c = companyService.getCompany(1); System.out.println(c);
		 */
		/*
		 * Company company = new Company(); company.setBusinessName("Flipkart");
		 * company.setEstablishedDate(new Date()); company.setContactNo("3039404");
		 * company.setEmailAddress("us@gmail.com");
		 * company.setHrRepresentativeName("Sam"); companyService.saveCompany(company);
		 */
		
		List<Company> companies = companyService.getCompanies(1, 1);
		System.out.println(companies);
	}
}
