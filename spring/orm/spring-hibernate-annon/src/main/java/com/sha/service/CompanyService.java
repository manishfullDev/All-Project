package com.sha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sha.dao.CompanyDao;
import com.sha.entities.Company;

@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;

	@Transactional(readOnly = true)
	public Company getCompany(int companyNo) {
		return companyDao.getCompany(companyNo);
	}
}
