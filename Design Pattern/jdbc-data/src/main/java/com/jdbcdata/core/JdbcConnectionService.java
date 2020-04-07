package com.jdbcdata.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbcdata.exception.JdbcDataConfigException;
import com.jdbcdata.exception.JdbcDataConnectionException;

public class JdbcConnectionService {
	protected String driverClassname;
	protected String url;
	protected String username;
	protected String password;

	public JdbcConnectionService(String driverClassname, String url, String username, String password) {
		this.driverClassname = driverClassname;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Connection newConnection() {
		Connection con = null;
		try {
			Class.forName(driverClassname);
			con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			throw new JdbcDataConfigException("failed loading driver", e);
		} catch (SQLException e) {
			throw new JdbcDataConnectionException("connection refused by database", e);
		}
		return con;
	}
}
