package com.jpa.accessor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.jpa.entities.Artist;
import com.jpa.helper.EntityManagerFactoryHelper;

public class ArtistAccessor {
	public Artist getArtist(int artistId) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		Artist artist = null;
		try {
			entityManagerFactory = EntityManagerFactoryHelper.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			artist = entityManager.find(Artist.class, artistId);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return artist;
	}
}
