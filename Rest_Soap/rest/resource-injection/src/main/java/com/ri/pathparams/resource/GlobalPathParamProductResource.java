package com.ri.pathparams.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/product/{productNo}")
public class GlobalPathParamProductResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getProduct(@PathParam("productNo") int productNo) {
		return (output) -> {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<product><productNo>").append(productNo)
					.append("</productNo><productName>Television</productName></product>");
			output.write(buffer.toString().getBytes());
			output.close();
		};
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/rating/{productNo}")
	public int getProductRating(@PathParam("productNo") int productNo) {
		return productNo;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/reviews")
	public StreamingOutput getReviews(@PathParam("productNo") int productNo) {
		return (output) -> {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<product><productNo>").append(productNo)
					.append("</productNo><review>Good</review></product>");
			output.write(buffer.toString().getBytes());
			output.close();
		};
	}
}














