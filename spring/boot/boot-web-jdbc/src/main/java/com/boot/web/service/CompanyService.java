package com.boot.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.web.bo.CompanyBo;
import com.boot.web.dao.CompanyDao;
import com.boot.web.dto.CompanyDto;

@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;

	public List<CompanyDto> getCompanies() {
		List<CompanyBo> companyBos = null;
		List<CompanyDto> companyDtos = null;

		companyBos = companyDao.getCompanies();
		companyDtos = new ArrayList<>();
		for (CompanyBo bo : companyBos) {
			companyDtos.add(new CompanyDto(bo.getCompanyNo(), bo.getCompanyName(), bo.getEstablishedDate()));
		}

		return companyDtos;
	}
}
