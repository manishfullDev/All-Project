package com.bfpp.beans;

public class ConnectionManager {
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionManager [driverClassname=" + driverClassname + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}

}
