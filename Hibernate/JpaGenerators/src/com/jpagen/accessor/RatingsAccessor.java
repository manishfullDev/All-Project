package com.jpagen.accessor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpagen.entities.Ratings;
import com.jpagen.helper.EntityManagerFactoryHelper;

public class RatingsAccessor {
	public int saveRating(Ratings ratings) {
		boolean flag = false;
		int ratingSequenceNo = 0;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(ratings);
			ratingSequenceNo = ratings.getRatingSequenceNo();

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

		return ratingSequenceNo;
	}
}
