package com.boot.jpa;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTemplate;

import com.boot.jpa.entities.Company;
import com.boot.jpa.service.CompanyService;

@SpringBootApplication
@EntityScan(basePackages = { "com.boot.jpa.entities" })
public class SpringBootJpaApplication {

	@Bean(autowire = Autowire.BY_TYPE)
	public JpaTemplate jpaTemplate() {
		return new JpaTemplate();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		try {
			CompanyService companyService = context.getBean("companyService", CompanyService.class);
			Company company = companyService.getCompany(1);
			System.out.println(company);
		} finally {
			System.exit(SpringApplication.exit(context));
		}
	}

}
