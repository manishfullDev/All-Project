package com.jbv.test;

import java.util.Calendar;
import java.util.TimeZone;

import com.jbv.bean.Journey;
import com.jbv.service.JourneyService;

public class JBVTest {
	public static void main(String[] args) {
		Journey journey = null;
		JourneyService journeyService = null;
		Calendar calendar = null;
		
		calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.set(2019, 9, 25);

		journey = new Journey();
		//journey.setJourneyNo(1);
		journey.setSource("Hyderabad");
		journey.setDestination("Banglore");
		journey.setJourneyDate(calendar.getTime());
		//journey.setPrice(101);
		journey.setBusNo("ap 09 bq 2935");
		journey.setTravelHours(1);
		
		journeyService = new JourneyService();
		journeyService.newJourney(journey);
	}
}











