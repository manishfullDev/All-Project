package com.slc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import com.slc.entities.Company;
import com.slc.helper.SessionFactoryHelper;

public class SLCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Statistics statistics = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			statistics = sessionFactory.getStatistics();

			session = sessionFactory.openSession();
			Company company = session.get(Company.class, 1);
			System.out.println(company);
			session.close();
			session = sessionFactory.openSession();
			Company company1 = session.get(Company.class, 1);

			System.out.println("l2 hit : " + statistics.getSecondLevelCacheHitCount());
			session.close();
			session = sessionFactory.openSession();
			Company company2 = session.get(Company.class, 1);
			System.out.println("l2 hit : " + statistics.getSecondLevelCacheHitCount());
			
		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}
	}
}
