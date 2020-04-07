package com.sr.resource;

import java.util.Date;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sr.dto.PickupRequest;
import com.sr.dto.PickupSchedule;

@Path("/parcel/pickup")
public class ParcelPickupResourse {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response pickup(PickupRequest request) {
		// Response response = null;
		// ResponseBuilder builder = null;
		PickupSchedule pickupSchedule = null;

		pickupSchedule = new PickupSchedule();
		pickupSchedule.setPickupRequestNo(new Random().nextInt());
		pickupSchedule.setPickupAgentName("Rahul");
		pickupSchedule.setPickupAgentMobileNo("930484044");
		pickupSchedule.setPickupDateAndTime(new Date());

		/*
		 * builder = Response.status(201); builder.header("platform", "mobile")
		 * .cookie(new NewCookie("pickRequestNo",
		 * String.valueOf(pickupSchedule.getPickupRequestNo())))
		 * .entity(Entity.json(pickupSchedule)); response = builder.build();
		 */

		return Response.status(201).header("platform", "Mobile").cookie(new NewCookie("pickupRequestNo", "948448"))
				.entity(Entity.json(pickupSchedule)).build();
	}

}












