package com.datajpa.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.datajpa.config.RootConfig;
import com.datajpa.entities.Company;
import com.datajpa.service.CompanyService;

public class DataJpaTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		CompanyService companyService = context.getBean("companyService", CompanyService.class);
		/*
		 * Company c = companyService.getCompany(1); System.out.println(c);
		 */
		List<Company> companies = companyService.getCompaniesByBusinessName("%a%");
		System.out.println(companies);

		int c = companyService.getNoOfCompaniesByBusinessName("%a%");
		System.out.println(c);

		List<Company> cs = companyService.getCompaniesBetweenStartAndEnd(new Date(), new Date());
		System.out.println(cs);
	}
}
