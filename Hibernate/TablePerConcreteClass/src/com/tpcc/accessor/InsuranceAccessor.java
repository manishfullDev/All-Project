package com.tpcc.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.entities.InsurancePolicy;
import com.tpcc.helper.SessionFactoryHelper;

public class InsuranceAccessor {
	public int saveInsurancePolicy(InsurancePolicy insurancePolicy) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		int policyNo = 0;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			policyNo = (int) session.save(insurancePolicy);

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
		return policyNo;
	}

	public InsurancePolicy getInsurancePolicy(Class<?> classType, int policyNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		InsurancePolicy insurancePolicy = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			insurancePolicy = (InsurancePolicy) session.get(classType, policyNo);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return insurancePolicy;
	}
}
