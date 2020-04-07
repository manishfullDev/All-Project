package com.bs5.test;

import com.bs5.accessor.TrackAccessor;
import com.bs5.entities.Track;
import com.bs5.helper.SessionFactoryHelper;

public class BS5Test {
	public static void main(String[] args) {
		TrackAccessor trackAccessor = new TrackAccessor();
		Track track = trackAccessor.getTrack(1);
		System.out.println(track);
		/*Track track  = new Track();
		track.setTrackNo(3);
		track.setTitle("Title1");
		track.setDuration(24);
		track.setGenere("Flok");
		track.setSingerName("xyz");
		track.setComposer("ci39");
		trackAccessor.saveTrack(track);*/
		SessionFactoryHelper.closeSessionFactory();
	}
}
