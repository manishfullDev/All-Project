package com.jb.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/enquiry")
public class RailEnquiryService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String railStatus(@QueryParam("trainNo") int trainNo) {
		return "Secunderabad : " + this.hashCode();
	}
}
