package com.pdp.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.pdp.exception.AlbumConfigException;
import com.pdp.exception.AlbumDatabaseException;

public class ConnectionManager {
	private static ConnectionManager instance;
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	private ConnectionManager() {
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
			throw new AlbumConfigException("unable to read/load database configuration", e);
		}
	}

	public static ConnectionManager getInstance() {
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				if (instance == null) {
					instance = new ConnectionManager();
				}
			}
		}
		return instance;
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			throw new AlbumDatabaseException("unable to connect to database", e);
		}
		return con;
	}

}
