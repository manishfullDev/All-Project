package com.ci.test;

import com.ci.accessors.TripAccessor;
import com.ci.entities.Trip;
import com.ci.entities.TripPk;

public class CITest {
	public static void main(String[] args) {
		TripAccessor tripAccessor = new TripAccessor();
		Trip trip = null;
		TripPk id = new TripPk();
		id.setSource("hyderabad");
		id.setDestination("banglore");
		id.setTripDay(1);
		id.setTripMonth(9);
		id.setTripYear(2019);
		id.setOrganizer("kaleswara");

		trip = tripAccessor.findTrip(id);
		System.out.println(trip);
	}
}
