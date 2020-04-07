package com.bs3.helper;

import org.hibernate.SessionFactory;

public class AbstractSessionFactoryHelper implements SessionFactoryHelper {
	protected SessionFactory sessionFactory;

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}
