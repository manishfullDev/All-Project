package com.acdr.polling.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/incometax")
public class IncomeTaxService {
	@GET
	@Path("/{panNo}/advancedtax")
	@Produces(MediaType.TEXT_PLAIN)
	public double getAdvancedTaxPaymentAmount(@PathParam("panNo") String panNo, @QueryParam("fromYear") int fromYear,
			@QueryParam("toYear") int toYear) {
		System.out.println("received request for advanced tax payment for pan : " + panNo);
		System.out.println("returning the advanced tax payment for pan : " + panNo);
		return 2300;
	}
}
