package com.ac.callback.test;

import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;

public class StockHistoryInvocationCallback implements InvocationCallback<Response> {

	@Override
	public void completed(Response response) {
		String history = null;
		history = response.readEntity(String.class);
		System.out.println("sending stock history as email with content : " + history);
	}

	@Override
	public void failed(Throwable throwable) {
		System.out.println("failed in fetching history with exception message: " + throwable.getMessage());
	}

}
