package com.ig.test;

import java.util.Date;

import com.ig.accessor.MusicianAccessor;
import com.ig.entities.Musician;
import com.ig.helper.SessionFactoryHelper;

public class IGTest {
	public static void main(String[] args) {
		Musician musician = null;
		MusicianAccessor accessor = null;
		try {
			accessor = new MusicianAccessor();
			musician = new Musician();
			musician.setMusicianName("pop");
			musician.setDob(new Date());
			musician.setGender("Male");
			musician.setLevel(5);
			musician.setInstrument("Any");
			accessor.saveMusician(musician);
		} finally {
			SessionFactoryHelper.closeSessionFactory();
		}
	}

}
