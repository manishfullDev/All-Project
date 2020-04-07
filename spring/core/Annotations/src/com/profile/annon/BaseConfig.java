package com.profile.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

public class BaseConfig {
	@Autowired
	protected Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public ProductAccessor productAccessor() {
		return new ProductAccessor();
	}

	@Bean
	public ConnectionManager connectionManager() {
		ConnectionManager connectionManager = new ConnectionManager();
		connectionManager.setDriverClassname(env.getProperty("driverClassname"));
		connectionManager.setUrl(env.getProperty("url"));
		connectionManager.setUsername(env.getProperty("username"));
		connectionManager.setPassword(env.getProperty("password"));

		return connectionManager;
	}
}
