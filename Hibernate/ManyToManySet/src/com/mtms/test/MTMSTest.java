package com.mtms.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtms.entities.Passenger;
import com.mtms.entities.Tour;
import com.mtms.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class MTMSTest {

	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Passenger passenger = null;
		Tour tour = null;
		Set<Passenger> passengers = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			passengers = new HashSet<>();
			
			passenger = new Passenger();
			passenger.setPassengerName("William");
			passenger.setAge(35);
			passenger.setGender("Male");
			passenger.setMobileNo("3939404");
			passenger.setEmailAddress("william@gmail");
			session.save(passenger);
			passengers.add(passenger);
			
			passenger = new Passenger();
			passenger.setPassengerName("Smith");
			passenger.setAge(35);
			passenger.setGender("Male");
			passenger.setMobileNo("93928494");
			passenger.setEmailAddress("smith@gmail");
			session.save(passenger);
			passengers.add(passenger);
			
			tour = new Tour();
			tour.setPackageName("Kashmir");
			tour.setDays(5);
			tour.setEnquiryEmailAddress("abctravels@gmail.com");
			tour.setPlannedDate(new Date());
			tour.setCost(3933.3);
			tour.setTourManagerName("Kapil");
			tour.setEnquiryNo("30390494");
			tour.setPassengers(passengers);
			
			session.save(tour);
			
			tour = session.get(Tour.class, 1);
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










