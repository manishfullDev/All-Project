package com.transport.test;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transport.entities.BusProviders;
import com.transport.helper.SessionFactoryHelper;

public class TransportTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		TypedQuery<BusProviders> query = null;
		List<BusProviders> busProviders = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			query = session.createQuery("from BusProviders", BusProviders.class);
			busProviders = query.getResultList();
			for (BusProviders provider : busProviders) {
				System.out.println(provider);
			}

		} finally {
			if (session != null) {
				session.close();
			}
			SessionFactoryHelper.closeSessionFactory();
		}
	}
}
