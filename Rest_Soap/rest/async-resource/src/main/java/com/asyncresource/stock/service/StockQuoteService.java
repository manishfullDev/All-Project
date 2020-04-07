package com.asyncresource.stock.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/stock")
public class StockQuoteService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void getStockQuote(@QueryParam("stockName") final String stockName, @Suspended AsyncResponse response) {
		Runnable r = () -> {
			double price = longRunningProcess();
			response.resume(Response.ok(price).build());
		};
		new Thread(r).start();
	}

	private double longRunningProcess() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 353.34;
	}

}
