package com.jdbcdata.factory;

import java.io.IOException;
import java.util.Properties;

import com.jdbcdata.core.JdbcConnectionService;
import com.jdbcdata.exception.JdbcDataConfigException;
import com.jdbcdata.sql.AbstractSqlSelect;

abstract public class SqlFactory {
	public AbstractSqlSelect createSqlSelect(String lClassName) {
		Properties props = null;
		AbstractSqlSelect abstractSqlSelect = null;
		JdbcConnectionService jdbcConnectionService = null;

		abstractSqlSelect = newSqlSelect(lClassName);
		props = new Properties();
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("data-config.properties"));
			jdbcConnectionService = new JdbcConnectionService(props.getProperty("driverClassname"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			abstractSqlSelect.setJdbcConnectionService(jdbcConnectionService);
		} catch (IOException e) {
			throw new JdbcDataConfigException("unable to load the data-config.properties", e);
		}

		return abstractSqlSelect;
	}

	abstract protected AbstractSqlSelect newSqlSelect(String lClassName);
}
