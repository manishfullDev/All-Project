package com.mba.helper;

import com.mba.security.beans.User;

public class SecurityHelper {
	private static SecurityHelper instance;
	private ThreadLocal<User> threadLocal;

	private SecurityHelper() {
		threadLocal = new ThreadLocal<User>();
	}

	public synchronized static SecurityHelper getInstance() {
		if (instance == null) {
			instance = new SecurityHelper();
		}
		return instance;
	}

	public void login(String un, String pwd) {
		User user = null;
		user = new User(un, pwd);
		threadLocal.set(user);
	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean authenticate() {
		User user = null;
		user = threadLocal.get();
		if (user != null) {
			if (user.getUn().equals("john") && user.getPwd().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		User user = null;
		user = threadLocal.get();
		if (user != null) {
			return user.getUn();
		}
		return null;
	}

}
