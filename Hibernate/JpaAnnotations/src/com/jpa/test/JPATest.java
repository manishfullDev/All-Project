package com.jpa.test;

import com.jpa.accessor.ArtistAccessor;
import com.jpa.entities.Artist;

public class JPATest {
	public static void main(String[] args) {
		ArtistAccessor accessor = new ArtistAccessor();
		Artist artist = accessor.getArtist(1);
		System.out.println(artist);
	}
}
