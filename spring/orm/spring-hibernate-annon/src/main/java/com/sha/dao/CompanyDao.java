package com.sha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sha.entities.Company;

@Repository
public class CompanyDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Company getCompany(int companyNo) {
		return hibernateTemplate.get(Company.class, companyNo);
	}

}
