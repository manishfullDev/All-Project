package com.acdr.polling.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/finance")
public class FinanceService {
	@GET
	@Path("/{panNo}/earnings")
	@Produces(MediaType.TEXT_PLAIN)
	public double earnings(@PathParam("panNo") String panNo, @QueryParam("fromYear") int fromYear,
			@QueryParam("toYear") int toYear) {
		System.out.println("received request for totalEarnings of pan : " + panNo);
		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("returning the totalEarnings for pan : " + panNo);
		return 394845;
	}
}
