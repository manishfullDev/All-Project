package com.profile.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class ConnectionManager {
	/* @Value("${driverClassname}") */
	private String driverClassname;
	/* @Value("${url}") */
	private String url;
	/* @Value("${username}") */
	private String username;
	/* @Value("${password}") */
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
