package com.sji.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.sji.entities.Company;

@Repository
public class CompanyDao {
	@Autowired
	private JpaTemplate jpaTemplate;

	public Company getCompany(int companyNo) {
		return jpaTemplate.find(Company.class, companyNo);
	}
}
