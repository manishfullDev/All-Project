package com.boot.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.jdbc.bo.CompanyBo;
import com.boot.jdbc.dao.CompanyDao;

@SpringBootApplication
public class BootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJdbcApplication.class, args);
		CompanyDao companyDao = context.getBean("companyDao", CompanyDao.class);
		List<CompanyBo> companies = companyDao.getCompanies();
		for(CompanyBo bo : companies) {
			System.out.println(bo);
		}
	}

}
