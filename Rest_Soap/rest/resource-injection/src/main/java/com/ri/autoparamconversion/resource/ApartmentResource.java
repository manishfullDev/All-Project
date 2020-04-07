package com.ri.autoparamconversion.resource;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/apartment")
public class ApartmentResource {
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{apartmentNo}")
	public String addRoom(@PathParam("apartmentNo") int apartmentNo, @QueryParam("length") Measurement length,
			@QueryParam("width") Measurement width,
			@QueryParam("roomType") @DefaultValue("livingRoom") String roomType) {
		StringBuilder builder = new StringBuilder();

		builder.append("apartmentNo :[ ").append(apartmentNo).append("] length : [").append(length.toString())
				.append(" ] width : [ ").append(width.toString()).append(" ] roomType : [").append(roomType)
				.append(" ]");
		return builder.toString();
	}
}
