package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entities.Lyric;
import com.flc.helper.SessionFactoryHelper;

public class FLCTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Lyric lyric = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			lyric = new Lyric();
			lyric.setGenere("Rock");
			lyric.setLanguage("Telugu");
			lyric.setSongTitle("Title2");
			lyric.setWriteUp("Write2");
			lyric.setWrittenBy("By2");
			session.save(lyric);

			lyric.setGenere("Pathos1");
			session.update(lyric);
			lyric.setLanguage("Hindi1");
			session.update(lyric);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFactoryHelper.closeSessionFactory();
		}
	}

	public static void read() {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();

			Lyric lyric1 = session.get(Lyric.class, 1);
			// session.clear();
			// session.evict(lyric1);

			Lyric lyric2 = session.get(Lyric.class, 1);

			System.out.println("lyric1 == lyric2 ? : " + (lyric1 == lyric2));

		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}

	}
}
