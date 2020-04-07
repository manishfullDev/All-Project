package com.ri.pathparams.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/car")
public class CarResource {
	@GET
	@Path("/search/{carType}/{location}")
	@Produces(MediaType.TEXT_PLAIN)
	public String search(@PathParam("carType") String carType, @PathParam("location") String location,
			@QueryParam("minPrice") int minPrice, @QueryParam("maxPrice") int maxPrice,
			@QueryParam("manufacturer") String manufacturer, @MatrixParam("emissionStandard") String emissionStandard) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("carType : ").append(carType).append(" location : ").append(location).append(" minPrice : ")
				.append(minPrice).append(" maxPrice: ").append(maxPrice).append(" manufacturer: ").append(manufacturer)
				.append(" emissionStandard :").append(emissionStandard);
		return buffer.toString();
	}
}
