package stackspace.org.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import stackspace.org.helper.SessionFactoryHelper;

import lombok.Cleanup;

public class Test {
	public static void main(String[] args) {
		@Cleanup
		SessionFactory sessionFactory = null;
		@Cleanup
		Session session = null;

		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
	}
}
