package com.st.accessor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.st.entities.GeneralAdmission;
import com.st.helper.EntityManagerFactoryHelper;

public class AdmissionAccessor {
	public int saveAdmission(GeneralAdmission admission) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		boolean flag = false;
		int admissionNo = 0;

		try {
			entityManagerFactory = EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(admission);
			admissionNo = admission.getAdmissionNo();
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return admissionNo;
	}

	public GeneralAdmission getAdmission(Class<?> classType, int admissionNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		GeneralAdmission admission = null;

		try {
			entityManagerFactory = EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			admission = (GeneralAdmission) entityManager.find(classType, admissionNo);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return admission;
	}
}
