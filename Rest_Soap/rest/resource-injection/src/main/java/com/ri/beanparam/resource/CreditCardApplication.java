package com.ri.beanparam.resource;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class CreditCardApplication {
	@PathParam("ifscCode")
	protected String ifscCode;
	@QueryParam("applicantName")
	protected String applicantName;
	@MatrixParam("cardType")
	protected String cardType;
	@QueryParam("occupation")
	protected String occupation;

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "CreditCardApplication [ifscCode=" + ifscCode + ", applicantName=" + applicantName + ", cardType="
				+ cardType + ", occupation=" + occupation + "]";
	}

}
