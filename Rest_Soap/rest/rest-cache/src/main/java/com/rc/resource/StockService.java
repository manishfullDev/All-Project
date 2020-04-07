package com.rc.resource;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/stock")
public class StockService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{stockName}")
	public Response getStockPrice(@PathParam("stockName") String stockName) {
		double price = 0.0f;
		Date expiryDate = null;
		Calendar calendar = null;
		Response response = null;

		calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.set(2019, 9, 06, 10, 50);
		expiryDate = calendar.getTime();
		System.out.println("expiry date : " + expiryDate);

		price = 394.4;
		response = Response.ok(price).expires(expiryDate).build();

		return response;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{stockName}/history")
	public Response getStockHistory(@PathParam("stockName") String stockName) {
		Response response = null;
		CacheControl cc = null;

		cc = new CacheControl();
		cc.setMaxAge(10000);
		cc.setPrivate(true);
		System.out.println("fetching stock history");

		response = Response.ok("39.34, 340.46,34.34").cacheControl(cc).build();

		return response;
	}
}
