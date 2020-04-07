package com.acdr.callback.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/nse/stock")
public class NSEStockQuoteService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{stockName}/quote")
	public double getStockPrice(@PathParam("stockName") String stockName) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		return 353.34f;
	}
}
