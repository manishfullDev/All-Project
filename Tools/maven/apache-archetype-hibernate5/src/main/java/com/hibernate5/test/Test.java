package com.hibernate5.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate5.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class Test {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
	}
}
