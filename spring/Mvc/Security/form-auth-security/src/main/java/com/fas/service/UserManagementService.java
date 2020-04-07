package com.fas.service;

import com.fas.bo.UserBo;
import com.fas.dao.UserDao;

public class UserManagementService {
	private UserDao userDao;

	public UserBo getUser(String emailAddress) {
		return userDao.getUser(emailAddress);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
