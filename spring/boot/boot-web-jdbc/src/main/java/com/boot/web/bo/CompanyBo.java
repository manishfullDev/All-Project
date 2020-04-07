package com.boot.web.bo;

import java.util.Date;

public class CompanyBo {
	protected int companyNo;
	protected String companyName;
	protected Date establishedDate;

	public CompanyBo(int companyNo, String companyName, Date establishedDate) {
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

	@Override
	public String toString() {
		return "CompanyBo [companyNo=" + companyNo + ", companyName=" + companyName + ", establishedDate="
				+ establishedDate + "]";
	}

}
