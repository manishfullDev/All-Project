package com.boot.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.jpa.dao.CompanyDao;
import com.boot.jpa.entities.Company;

@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;

	@Transactional(readOnly = true)
	public Company getCompany(int companyNo) {
		return companyDao.getCompany(companyNo);
	}

}
