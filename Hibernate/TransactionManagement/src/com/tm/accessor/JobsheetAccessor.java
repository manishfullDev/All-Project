package com.tm.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tm.entities.Jobsheet;
import com.tm.helper.SessionFactoryHelper;

public class JobsheetAccessor {
	public void saveJobSheet(Jobsheet jobsheet) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			//transaction = session.beginTransaction();
			session.save(jobsheet);
			flag = true;
		} finally {
			/*if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}*/
			if (session != null) {
				session.close();
			}
		}
	}
}
