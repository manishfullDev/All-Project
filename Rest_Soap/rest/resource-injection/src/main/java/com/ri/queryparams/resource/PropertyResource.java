package com.ri.queryparams.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/property")
public class PropertyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{location}/apartments")
	public String searchApartments(@PathParam("location") String location, @QueryParam("facing") List<String> facings,
			@QueryParam("sqft") List<Integer> sqfts) {
		StringBuffer buffer = null;
		buffer = new StringBuffer();
		buffer.append("location : ").append(location).append(" facings : ");
		for (String facing : facings) {
			buffer.append("[").append(facing).append("] ");
		}
		buffer.append(" sqfts : ");
		for (Integer sqft : sqfts) {
			buffer.append("[").append(sqft).append("] ");
		}
		return buffer.toString();
	}
}









