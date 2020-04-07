package com.fh.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fh.entities.ServiceAdvisor;

public class ServiceAdvisorAccessor {
	public ServiceAdvisor getServiceAdvisor(int serviceAdvisorNo) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		ServiceAdvisor serviceAdvisor = null;

		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		serviceAdvisor = (ServiceAdvisor) session.get(ServiceAdvisor.class, serviceAdvisorNo);

		return serviceAdvisor;
	}
}
