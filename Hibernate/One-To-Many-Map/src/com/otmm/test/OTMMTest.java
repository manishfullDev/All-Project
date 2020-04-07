package com.otmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmm.entities.Package;
import com.otmm.entities.Shippment;
import com.otmm.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class OTMMTest {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		@Cleanup
		Session session = null;
		boolean flag = false;
		Package pkg = null;
		Shippment shippment = null;

		Map<String, Package> packages = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			packages = new HashMap<>();

			pkg = new Package();
			pkg.setBookingDate(new Date());
			pkg.setCharges(350);
			pkg.setDestinationAddress("banglore");
			pkg.setSourceAddress("hyderabad");
			pkg.setWeight(35);
			session.save(pkg);

			packages.put("t1", pkg);

			pkg = new Package();
			pkg.setBookingDate(new Date());
			pkg.setCharges(1250);
			pkg.setDestinationAddress("hyderabad");
			pkg.setSourceAddress("chennai");
			pkg.setWeight(354);
			session.save(pkg);
			packages.put("t2", pkg);

			shippment = new Shippment();
			shippment.setShippmentDate(new Date());
			shippment.setContactNo("93803");
			shippment.setExpectedDeliveryDate(new Date());
			shippment.setInChargeName("Ramesh");
			shippment.setShippingCompanyName("Bluedart");
			shippment.setStatus("in-transit");
			shippment.setPackages(packages);
			session.save(shippment);
			shippment = session.get(Shippment.class, 1);
			System.out.println(shippment);

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
