package com.msf.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.msf.entities.Vehicle;
import com.msf.helper.SessionFactoryRegistry;

public class VehicleAccessor {
	public Vehicle getVehicle(int vehicleNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Vehicle vehicle = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			vehicle = (Vehicle) session.get(Vehicle.class, vehicleNo);
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return vehicle;
	}
}
