package com.jpagen.test;

import com.jpagen.accessor.RatingsAccessor;
import com.jpagen.entities.Ratings;
import com.jpagen.helper.EntityManagerFactoryHelper;

public class JpaGenTest {
	public static void main(String[] args) {
		try {
			RatingsAccessor ratingsAccessor = new RatingsAccessor();
			Ratings ratings = new Ratings();
			ratings.setAlbumName("Album-1");
			ratings.setRating(3);
			ratings.setReviewer("sriman");
			ratings.setComments("Not good");

			int seq = ratingsAccessor.saveRating(ratings);
			System.out.println("seq:  " + seq);
		} finally {
			EntityManagerFactoryHelper.closeEntityManagerFactory();
		}
	}
}
