package com.ig.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ig.entities.Musician;
import com.ig.helper.SessionFactoryHelper;

public class MusicianAccessor {

	public void saveMusician(Musician musician) {
		boolean flag = false;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(musician);

			System.out.println("id : " + musician.getMusicianId());
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
		}

	}
}
