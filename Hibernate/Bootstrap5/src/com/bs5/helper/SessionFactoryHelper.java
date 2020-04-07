package com.bs5.helper;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bs5.interceptor.UserInterceptor;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;

	static {
		Metadata metadata = null;
		
		MetadataSources metadataSources = null;
		MetadataBuilder metadataBuilder = null;
		StandardServiceRegistry registry = null;
		StandardServiceRegistryBuilder builder = null;
		SessionFactoryBuilder sessionFactoryBuilder = null;
		try {
			builder = new StandardServiceRegistryBuilder().configure();
			registry = builder.build();
			metadataSources = new MetadataSources(registry);
			metadataBuilder = metadataSources.getMetadataBuilder();
			metadata = metadataBuilder.build();
			sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
			sessionFactoryBuilder.applyInterceptor(new UserInterceptor());
			
			sessionFactoryBuilder.allowOutOfTransactionUpdateOperations(true);
			sessionFactory = sessionFactoryBuilder.build();
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
