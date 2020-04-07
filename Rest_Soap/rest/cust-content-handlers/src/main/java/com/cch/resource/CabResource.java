package com.cch.resource;

import java.util.Date;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cch.dto.CabRequest;
import com.cch.dto.Trip;

@Path("/cab")
public class CabResource {
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Trip rideNow(CabRequest cabRequest) {
		Trip trip = null;

		trip = new Trip();
		trip.setTripNo(new Random().nextInt());
		trip.setTripDate(new Date());
		trip.setEstimatedAmount(200);
		trip.setEstimatedArrivalTimeInMinutes(10);
		trip.setDriverName(cabRequest.getPassengerName());
		trip.setDriverContactNo(cabRequest.getPassengerContactNo());
		trip.setCabNo("TS 09 TB 3984");
		trip.setTripOtp(2342);

		return trip;
	}

}
