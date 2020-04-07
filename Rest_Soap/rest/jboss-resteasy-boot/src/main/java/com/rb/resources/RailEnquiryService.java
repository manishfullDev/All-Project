package com.rb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/enquiry")
public class RailEnquiryService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String trainStatus(@QueryParam("trainNo") int trainNo) {
		return "Nalgonda : " + this.hashCode();
	}
}
