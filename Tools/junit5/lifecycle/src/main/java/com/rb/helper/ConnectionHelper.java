package com.rb.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHelper {
	private static final String DEFAULT_DB_CONFIG_FILE = "db.properties";
	protected String driverClassname;
	protected String url;
	protected String username;
	protected String password;

	public ConnectionHelper() throws IOException {
		this(DEFAULT_DB_CONFIG_FILE);
	}

	public ConnectionHelper(String dbConfigFile) throws IOException {
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream(dbConfigFile));
		driverClassname = props.getProperty("driverClassname");
		url = props.getProperty("url");
		username = props.getProperty("username");
		password = props.getProperty("password");
	}

	public Connection getConnection() throws SQLException, IOException {
		Connection con = null;

		con = DriverManager.getConnection(url, username, password);
		con.setAutoCommit(false);
		return con;
	}
}
