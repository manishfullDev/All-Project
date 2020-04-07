package com.npjt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = { "com.npjt.accessor" })
public class PersistenceConfig {
	@Autowired
	private Environment env;
	@Autowired
	private DataSource dataSource;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = null;
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("driverClassname"));
		dataSource.setUrl(env.getProperty("url"));
		dataSource.setUsername(env.getProperty("user"));
		dataSource.setPassword(env.getProperty("password"));

		return dataSource;
	}

	@Bean
	public NamedParameterJdbcTemplate npJdbcTemplate() {
		NamedParameterJdbcTemplate npJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		return npJdbcTemplate;
	}
}
