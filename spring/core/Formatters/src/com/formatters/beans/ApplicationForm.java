package com.formatters.beans;

public class ApplicationForm {
	private Passport passport;

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "ApplicationForm [passport=" + passport + "]";
	}

}
