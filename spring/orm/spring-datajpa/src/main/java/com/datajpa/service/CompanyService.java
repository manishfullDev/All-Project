package com.datajpa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datajpa.entities.Company;
import com.datajpa.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;

	@Transactional(readOnly = true)
	public Company getCompany(int companyNo) {
		return companyRepository.getOne(companyNo);
	}

	public List<Company> getCompaniesByBusinessName(String businessName) {
		return companyRepository.getCompaniesByBusinessNameLike(businessName);
	}
	
	public int getNoOfCompaniesByBusinessName(String businessName) {
		return companyRepository.countCompaniesByBusinessNameLike(businessName);
	}
	
	public List<Company> getCompaniesBetweenStartAndEnd(Date fromDate, Date toDate) {
		return companyRepository.getCompaniesBetweenStartAndEnd(fromDate, toDate);
	}
}
