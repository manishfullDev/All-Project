package com.mba.security.beans;

public class User {
	private String un;
	private String pwd;

	public User(String un, String pwd) {
		super();
		this.un = un;
		this.pwd = pwd;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
