package com.fas.security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.fas.bo.UserBo;
import com.fas.security.bean.UserDetailsImpl;
import com.fas.service.UserManagementService;

public class UserDetailsServiceImpl implements UserDetailsService {
	private UserManagementService userManagementService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDetails = null;
		UserBo userBo = null;

		userBo = userManagementService.getUser(username);
		if (userBo != null) {
			userDetails = new UserDetailsImpl(userBo.getEmailAddress(), userBo.getPassword(), userBo.getStatus(),
					userBo.getUserRole().getUserRoleName());
		} else {
			throw new UsernameNotFoundException("username not found");
		}

		return userDetails;
	}

	public void setUserManagementService(UserManagementService userManagementService) {
		this.userManagementService = userManagementService;
	}

}
