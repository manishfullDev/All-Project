#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ${package}.helper.SessionFactoryHelper;

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
