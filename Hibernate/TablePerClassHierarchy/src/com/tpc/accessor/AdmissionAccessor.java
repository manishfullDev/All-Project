package com.tpc.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpc.entities.GeneralAdmission;
import com.tpc.helper.SessionFactoryHelper;

public class AdmissionAccessor {

	public int saveAdmission(GeneralAdmission admission) {
		boolean flag = false;
		int admissionNo = 0;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			admissionNo = (Integer) session.save(admission);
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
		return admissionNo;
	}

	public GeneralAdmission getAdmission(Class<?> classType, int admissionNo) {
		GeneralAdmission generalAdmission = null;
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			generalAdmission = (GeneralAdmission) session.get(classType, admissionNo);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return generalAdmission;
	}
}












