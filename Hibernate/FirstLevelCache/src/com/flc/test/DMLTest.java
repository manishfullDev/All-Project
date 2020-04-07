package com.flc.test;

import java.time.Year;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entities.Lyric;
import com.flc.helper.SessionFactoryHelper;

public class DMLTest {
	public static void main(String[] args) {
		Lyric lyric = null;
		try {

			lyric = new Lyric();
			lyric.setLyricId(1);
			lyric.setSongTitle("Merge Example");
			lyric.setWriteUp("Merge data");

			// update(lyric);
			//delete(2);
			// System.out.println("id : " + id);
			merge(lyric);

		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}
	}

	public static int save(Lyric lyric) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		int lyricId = 0;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			lyricId = (Integer) session.save(lyric);
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
		return lyricId;
	}

	public static void persist(Lyric lyric) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.persist(lyric);
			// flag = true;
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

	public static void update(Lyric lyric) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
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
		}
	}

	public static void delete(int id) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Lyric lyric = null;

		try {

			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			lyric = session.load(Lyric.class, id);
			session.delete(lyric);
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

	public static void merge(Lyric lyric) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Lyric s_lyric = null;

		try {

			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			s_lyric = session.get(Lyric.class, lyric.getLyricId());
			lyric.setGenere(s_lyric.getGenere());
			lyric.setLanguage(s_lyric.getLanguage());
			lyric.setWrittenBy(s_lyric.getWrittenBy());
			
			session.merge(lyric);
			
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
