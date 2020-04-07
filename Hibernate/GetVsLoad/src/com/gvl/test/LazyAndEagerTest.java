package com.gvl.test;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gvl.entities.ILyricist;
import com.gvl.entities.Lyricist;
import com.gvl.helper.SessionFactoryHelper;

public class LazyAndEagerTest {
	public static void main(String[] args) {
		try {
			// lazyAndEager();
			// NoRecord();
			// loadWithLazyAndEager();
			finalClass();
			// requireSession();
		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}
	}

	public static void lazyAndEager() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Lyricist e_Lyricist = null;
		Lyricist l_Lyricist = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			/*
			 * e_Lyricist = session.get(Lyricist.class, 1);
			 * System.out.println("sql query executed and data fetched");
			 * System.out.println("lyricistName : " + e_Lyricist.getLyricistName());
			 */

			l_Lyricist = session.load(Lyricist.class, 1);
			/*
			 * System.out.println("sql query has not executed and data has not fetched");
			 * int lyricistId = l_Lyricist.getLyricistId();
			 * System.out.println("sql query has not executed and data has not fetched");
			 * System.out.println("lyricistId : " + lyricistId);
			 */
			System.out.println("Lyricst Class : " + l_Lyricist.getClass().getName());

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static void NoRecord() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Lyricist e_Lyricist = null;
		Lyricist l_Lyricist = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			/*
			 * e_Lyricist = session.get(Lyricist.class, 2); if(e_Lyricist != null) {
			 * System.out.println("lyricist name : " + e_Lyricist.getLyricistName()); }else
			 * { System.out.println("get:: no record found"); }
			 */

			l_Lyricist = session.load(Lyricist.class, 2);
			try {
				System.out.println("lyricist name : " + l_Lyricist.getLyricistName());
			} catch (ObjectNotFoundException e) {
				System.out.println("load:: no record found");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public static void loadWithLazyAndEager() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Lyricist l_Lyricist = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			l_Lyricist = session.load(Lyricist.class, 1);
			System.out.println("lyricist class : " + l_Lyricist.getClass().getName());

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static void finalClass() {
		SessionFactory sessionFactory = null;
		Session session = null;
		ILyricist l_Lyricist = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			l_Lyricist = session.load(ILyricist.class, 1);
			System.out.println("lyricist class : " + l_Lyricist.getClass().getName());

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public static void requireSession() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Lyricist l_Lyricist = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			l_Lyricist = session.load(Lyricist.class, 1);
			session.close();
			System.out.println(l_Lyricist.getLyricistName());

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
