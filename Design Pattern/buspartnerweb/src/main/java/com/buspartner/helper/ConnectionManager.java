package com.buspartner.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static ConnectionManager instance;
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	private ConnectionManager() throws Exception {
		Properties props = null;

		try {
			props = new Properties();
			props.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
			driverClassname = props.getProperty("driverClassname");
			url = props.getProperty("url");
			username = props.getProperty("username");
			password = props.getProperty("password");

			Class.forName(driverClassname);
		} catch (ClassNotFoundException | IOException e) {
			throw e;
		}
	}

	public static ConnectionManager getInstance() throws Exception {
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				if (instance == null) {
					instance = new ConnectionManager();
				}
			}
		}
		return instance;
	}

	public Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			throw e;
		}
		return con;
	}

}
