package com.boot.web.dto;

import java.util.Date;

public class CompanyDto {
	protected int companyNo;
	protected String companyName;
	protected Date establishedDate;

	public CompanyDto(int companyNo, String companyName, Date establishedDate) {
		super();
		this.companyNo = companyNo;
		this.companyName = companyName;
		this.establishedDate = establishedDate;
	}

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

}
