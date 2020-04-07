package com.bs3.accessor;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs3.entities.Album;
import com.bs3.helper.ProgSessionFactoryHelper;
import com.bs3.helper.ServiceRegistrySessionFactoryHelper;
import com.bs3.helper.SessionFactoryHelper;

public class AlbumAccessor {
	public Album getAlbum(int id) throws IOException {
		SessionFactoryHelper sessionFactoryHelper = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Album album = null;

		try {
			sessionFactoryHelper = ServiceRegistrySessionFactoryHelper.getInstance();
			sessionFactory = sessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			album = (Album) session.get(Album.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return album;
	}
}
