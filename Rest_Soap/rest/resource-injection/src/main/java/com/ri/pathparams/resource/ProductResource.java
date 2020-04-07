package com.ri.pathparams.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{category}-{productNo:\\d}")
	public double getProductPrice(@PathParam("category") String category, @PathParam("productNo") int productNo) {
		System.out.println("category : " + category + " productNo : " + productNo);
		return 3593.4;
	}
}
