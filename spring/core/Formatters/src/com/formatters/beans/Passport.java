package com.formatters.beans;

public class Passport {
	private String uid;
	private String issuedAuthorityCode;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getIssuedAuthorityCode() {
		return issuedAuthorityCode;
	}

	public void setIssuedAuthorityCode(String issuedAuthorityCode) {
		this.issuedAuthorityCode = issuedAuthorityCode;
	}

	@Override
	public String toString() {
		return "Passport [uid=" + uid + ", issuedAuthorityCode=" + issuedAuthorityCode + "]";
	}

}
