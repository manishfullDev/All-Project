package com.ig.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		/*
		 * sessionFactory = new MetadataSources( new
		 * StandardServiceRegistryBuilder().configure("hibernate-oracle.cfg.xml").build(
		 * )).buildMetadata() .buildSessionFactory();
		 */
		try {
			Configuration configuration = new Configuration().configure("hibernate-oracle.cfg.xml");
			sessionFactory = configuration.buildSessionFactory(
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
