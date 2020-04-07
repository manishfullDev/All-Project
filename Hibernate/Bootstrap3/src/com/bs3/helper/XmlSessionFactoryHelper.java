package com.bs3.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlSessionFactoryHelper extends AbstractSessionFactoryHelper {
	private static XmlSessionFactoryHelper instance;

	private XmlSessionFactoryHelper() {
		Configuration configuration = new Configuration().configure("com/bs3/common/koyal-hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}

	public static synchronized XmlSessionFactoryHelper getInstance() {
		if (instance == null) {
			instance = new XmlSessionFactoryHelper();
		}
		return instance;
	}

}
