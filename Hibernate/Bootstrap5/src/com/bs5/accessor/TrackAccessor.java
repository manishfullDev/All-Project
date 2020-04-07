package com.bs5.accessor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs5.entities.Track;
import com.bs5.helper.SessionFactoryHelper;

public class TrackAccessor {
	public Track getTrack(int trackNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Track track = null;

		try {
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			track = session.get(Track.class, trackNo);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return track;
	}
	public void saveTrack(Track track) {
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			sessionFactory  = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			session.save(track);
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
}

















