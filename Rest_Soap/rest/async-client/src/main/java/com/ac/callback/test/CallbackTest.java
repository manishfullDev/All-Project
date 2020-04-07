package com.ac.callback.test;

import javax.ws.rs.client.ClientBuilder;

public class CallbackTest {
	private final static String NSE_STOCK_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/nse/stock";
	private final static String STOCK_QUOTE_SUB_URI = "/{stockName}/quote";

	private final static String NSE_STOCK_HISTORY_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/nse/history";
	private final static String STOCK_LAST3DAYS_HISTORY_SUB_URI = "/stock/{stockName}";

	public static void main(String[] args) {
		ClientBuilder.newClient().target(NSE_STOCK_RESOURCE_URI).path(STOCK_QUOTE_SUB_URI)
				.resolveTemplate("stockName", "cipla").request().async().get(new StockQuoteInvocationCallback());

		ClientBuilder.newClient().target(NSE_STOCK_HISTORY_RESOURCE_URI).path(STOCK_LAST3DAYS_HISTORY_SUB_URI)
				.resolveTemplate("stockName", "cipla").request().async().get(new StockHistoryInvocationCallback());
	}
}
