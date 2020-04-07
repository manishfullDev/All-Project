package com.acdr.callback.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/nse/history")
public class NSEStockHistoryService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/stock/{stockName}")
	public String getLast3DaysStockQuote(@PathParam("stockName") String stockName) {
		return "838.34, 789.34, 876.34";
	}
}
