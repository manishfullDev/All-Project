package com.sji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sji.dao.CompanyDao;
import com.sji.entities.Company;

@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;

	@Transactional(readOnly = true)
	public Company getCompany(int companyNo) {
		return companyDao.getCompany(companyNo);
	}
}
