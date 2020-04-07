package com.otmoto.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmoto.entities.Warranty;
import com.otmoto.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class WarrantyAccessor {

	public int saveWarranty(Warranty warranty) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		@Cleanup
		Session session = null;
		boolean flag = false;
		int warrantyNo = 0;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			warrantyNo = (int) session.save(warranty);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		return warrantyNo;
	}
}
