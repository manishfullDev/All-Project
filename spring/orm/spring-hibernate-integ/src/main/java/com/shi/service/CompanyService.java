package com.shi.service;

import java.util.Date;
import java.util.List;

import com.shi.dao.CompanyDao;
import com.shi.entities.Company;

public class CompanyService {
	private CompanyDao companyDao;

	public Company getCompany(int companyNo) {
		return companyDao.find(companyNo);
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public List<Company> getCompanies(Date fromDate, Date toDate) {
		return companyDao.getCompanies(fromDate, toDate);
	}

	public List<Company> getAllCompanies() {
		return companyDao.getAllCompanies();
	}

	public int saveCompany(Company company) {
		return companyDao.saveCompany(company);
	}
	
	public List<Company> getCompanies(int pageNo, int pageSize) {
		return companyDao.getCompanies(pageNo, pageSize);
	}
}
