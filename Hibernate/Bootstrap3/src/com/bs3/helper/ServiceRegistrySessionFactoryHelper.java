package com.bs3.helper;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ServiceRegistrySessionFactoryHelper extends AbstractSessionFactoryHelper {
	private static ServiceRegistrySessionFactoryHelper instance;

	private ServiceRegistrySessionFactoryHelper() {
		Configuration configuration = null;
		StandardServiceRegistry standardServiceRegistry = null;
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = null;

		configuration = new Configuration().configure("com/bs3/common/koyal-hibernate.cfg.xml");
		standardServiceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		standardServiceRegistry = standardServiceRegistryBuilder.build();
		sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
	}

	public static synchronized ServiceRegistrySessionFactoryHelper getInstance() {
		if (instance == null) {
			instance = new ServiceRegistrySessionFactoryHelper();
		}
		return instance;
	}

}
