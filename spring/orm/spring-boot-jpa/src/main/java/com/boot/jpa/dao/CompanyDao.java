package com.boot.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.boot.jpa.entities.Company;

@Repository
@DependsOn("jpaTemplate")
public class CompanyDao {
	@Autowired
	private JpaTemplate jpaTemplate;

	public Company getCompany(int companyNo) {
		return jpaTemplate.find(Company.class, companyNo);
	}
}
