package com.otmoto.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmoto.entities.Product;
import com.otmoto.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class ProductAccessor {

	public int saveProduct(Product product) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		@Cleanup
		Session session = null;
		boolean flag = false;
		int productNo = 0;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			productNo = (int) session.save(product);
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
		return productNo;
	}

	public Product getProduct(int productNo) {
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;
		Product product = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		product = session.get(Product.class, productNo);
		return product;
	}
}
