package com.mtmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.entities.Passenger;
import com.mtmm.entities.Tour;
import com.mtmm.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class MTMMTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Passenger passenger = null;
		Tour tour = null;
		Map<String, Passenger> passengers = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			passengers = new HashMap<String, Passenger>();
			passenger = new Passenger();
			passenger.setPassengerName("William");
			passenger.setAge(35);
			passenger.setGender("Male");
			passenger.setMobileNo("3939404");
			passenger.setEmailAddress("william@gmail");
			session.save(passenger);
			passengers.put(UUID.randomUUID().toString(), passenger);

			passenger = new Passenger();
			passenger.setPassengerName("Smith");
			passenger.setAge(35);
			passenger.setGender("Male");
			passenger.setMobileNo("93928494");
			passenger.setEmailAddress("smith@gmail");
			session.save(passenger);
			passengers.put(UUID.randomUUID().toString(), passenger);
			
			tour = new Tour();
			tour.setPackageName("Kashmir");
			tour.setDays(5);
			tour.setPlannedDate(new Date());
			tour.setDescription("Holiday Tour");
			tour.setCost(3933.3);
			tour.setPassengers(passengers);

			session.save(tour);
			tour = session.get(Tour.class, 2);
			System.out.println(tour);
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
	}
}
