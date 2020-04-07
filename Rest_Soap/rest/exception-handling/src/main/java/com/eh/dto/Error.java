package com.eh.dto;

public class Error {
	protected String errorCode;
	protected String cause;

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
