package com.otmm.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build())
					.buildMetadata().buildSessionFactory();
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
