package com.sasr.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sasr.service.initiator.DriverManagerJdbcConnectionProviderServiceInitiator;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = null;
		StandardServiceRegistry standardServiceRegistry = null;
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = null;
		DriverManagerJdbcConnectionProviderServiceInitiator driverManagerJdbcConnectionProviderServiceInitiator = null;

		configuration = new Configuration().configure();
		driverManagerJdbcConnectionProviderServiceInitiator = new DriverManagerJdbcConnectionProviderServiceInitiator();
		standardServiceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.addInitiator(driverManagerJdbcConnectionProviderServiceInitiator);
		standardServiceRegistry = standardServiceRegistryBuilder.build();
		sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactoryHelper.sessionFactory = sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
