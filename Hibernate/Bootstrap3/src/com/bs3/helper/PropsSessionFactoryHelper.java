package com.bs3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropsSessionFactoryHelper extends AbstractSessionFactoryHelper {
	private static PropsSessionFactoryHelper instance;

	private PropsSessionFactoryHelper() {
		Configuration configuration = new Configuration();
		configuration.addResource("com/bs3/entities/Album.hbm.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	public static synchronized PropsSessionFactoryHelper getInstance() {
		if (instance == null) {
			instance = new PropsSessionFactoryHelper();
		}
		return instance;
	}

}
