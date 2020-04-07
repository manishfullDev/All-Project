package com.ac.callback.test;

import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;

public class StockQuoteInvocationCallback implements InvocationCallback<Response> {

	@Override
	public void completed(Response response) {
		double stockPrice = 0;
		stockPrice = response.readEntity(Double.class);
		System.out.println("sending email with stock quote price : " + stockPrice);
	}

	@Override
	public void failed(Throwable throwable) {
		System.out.println("failed in get stock quote price with message : " + throwable.getMessage());
	}

}
