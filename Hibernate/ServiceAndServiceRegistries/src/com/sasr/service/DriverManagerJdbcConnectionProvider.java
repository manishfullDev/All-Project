package com.sasr.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.Configurable;
import org.hibernate.service.spi.Startable;
import org.hibernate.service.spi.Stoppable;

public class DriverManagerJdbcConnectionProvider implements ConnectionProvider, Configurable, Startable, Stoppable {
	private Map configurationMap;
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	@Override
	public void start() {
		Set<String> keys = null;

		keys = configurationMap.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + configurationMap.get(key));
		}
		driverClassname = (String) configurationMap.get("connection.driver_class");
		url = (String) configurationMap.get("connection.url");
		username = (String) configurationMap.get("connection.username");
		password = (String) configurationMap.get("connection.password");
		try {
			Class.forName(driverClassname);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Failed in loading the driverClassName : " + driverClassname);
		}
	}

	@Override
	public void stop() {
		configurationMap = null;
	}

	@Override
	public void configure(Map configurationMap) {
		this.configurationMap = configurationMap;
	}

	@Override
	public void closeConnection(Connection connection) throws SQLException {
		if (connection != null && connection.isClosed() == false) {
			connection.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection connection = null;

		System.out.println("creating and returning new connection");
		
		connection = DriverManager.getConnection(url, username, password);
		connection.setAutoCommit(false);
		return connection;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}

	@Override
	public boolean isUnwrappableAs(Class clazz) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> clazz) {
		return null;
	}

}
