package com.sasr.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sasr.entities.Singer;
import com.sasr.helper.SessionFactoryHelper;

public class SingerAccessor {

	public Singer getSinger(int singerId) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Singer singer = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			singer = (Singer) session.get(Singer.class, singerId);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return singer;
	}
}
