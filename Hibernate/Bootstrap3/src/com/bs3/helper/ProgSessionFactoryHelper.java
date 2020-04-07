package com.bs3.helper;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgSessionFactoryHelper extends AbstractSessionFactoryHelper {
	private static ProgSessionFactoryHelper instance;

	private ProgSessionFactoryHelper() throws IOException {
		Configuration configuration = null;
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("koyal-db.properties"));

		configuration = new Configuration();
		configuration.setProperty("hibernate.connection.driver_class", props.getProperty("driver_class"));

		configuration.setProperty("hibernate.connection.url", props.getProperty("url"));
		configuration.setProperty("hibernate.connection.username", props.getProperty("username"));
		configuration.setProperty("hibernate.connection.password", props.getProperty("password"));
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");

		configuration.addResource("com/bs3/entities/Album.hbm.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	public static synchronized ProgSessionFactoryHelper getInstance() throws IOException {
		if (instance == null) {
			instance = new ProgSessionFactoryHelper();
		}
		return instance;
	}
}
