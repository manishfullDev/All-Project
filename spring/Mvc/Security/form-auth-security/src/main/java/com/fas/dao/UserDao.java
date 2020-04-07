package com.fas.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fas.bo.UserBo;
import com.fas.bo.UserRoleBo;

public class UserDao {
	private final String SQL_GET_USER_DETAILS = "select u.user_id, u.email_address, u.password, u.status, ur.user_role_id, ur.user_role_nm from users u inner join user_roles ur on u.user_role_id=ur.user_role_id where email_address = ?";
	private JdbcTemplate jdbcTemplate;

	public UserDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserBo getUser(String emailAddress) {
		return jdbcTemplate.queryForObject(SQL_GET_USER_DETAILS, (rs, rowNum) -> {
			UserBo user = null;
			UserRoleBo userRole = null;

			userRole = new UserRoleBo(rs.getInt(5), rs.getString(6));
			user = new UserBo();
			user.setUserId(rs.getInt(1));
			user.setEmailAddress(rs.getString(2));
			user.setPassword(rs.getString(3));
			user.setStatus(rs.getString(4));
			user.setUserRole(userRole);

			return user;
		}, emailAddress);

	}
}
