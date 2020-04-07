package com.rc.cg.dto;

public class Error {
	private String errorCode;
	private String cause;

	public Error(String errorCode, String cause) {
		this.errorCode = errorCode;
		this.cause = cause;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
