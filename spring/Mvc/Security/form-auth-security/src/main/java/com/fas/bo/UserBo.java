package com.fas.bo;

public class UserBo {
	protected int userId;
	protected String emailAddress;
	protected String password;
	protected UserRoleBo userRole;
	protected String status;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRoleBo getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleBo userRole) {
		this.userRole = userRole;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
