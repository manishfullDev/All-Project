package com.annotations.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.annotations.entities.MusicStudio;
import com.annotations.helper.SessionFactoryHelper;

public class MusicStudioAccessor {

	public MusicStudio getMusicStudio(int musicStudioId) {
		SessionFactory sessionFactory = null;
		Session session = null;
		MusicStudio musicStudio = null;
		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			musicStudio = session.get(MusicStudio.class, musicStudioId);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return musicStudio;
	}

}
