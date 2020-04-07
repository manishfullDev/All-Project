package com.ci.accessors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ci.entities.Trip;
import com.ci.entities.TripPk;
import com.ci.helper.SessionFactoryHelper;

public class TripAccessor {
	public void saveTrip(Trip trip) {
		boolean flag = false;
		Session session = null;
		Transaction transaction = null;
		SessionFactory sessionFactory = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(trip);

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

	public Trip findTrip(TripPk pk) {
		Trip l_trip = null;
		Session session = null;
		SessionFactory sessionFactory = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			l_trip = session.get(Trip.class, pk);

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return l_trip;
	}

}
