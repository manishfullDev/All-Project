package com.jpaconfig.accessor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpaconfig.entities.RecordingStudio;
import com.jpaconfig.helper.EntityManagerFactoryHelper;

public class RecordingStudioAccessor {
	public void saveRecordingStudio(RecordingStudio studio) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		boolean flag = false;

		try {
			entityManagerFactory = EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(studio);
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

	}
}
