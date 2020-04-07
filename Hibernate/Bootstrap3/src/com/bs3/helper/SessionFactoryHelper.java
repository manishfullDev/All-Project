package com.bs3.helper;

import org.hibernate.SessionFactory;

public interface SessionFactoryHelper {
	SessionFactory getSessionFactory();

	void closeSessionFactory();
}
