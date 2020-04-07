package com.adapter.market;

import java.util.UUID;

import com.adapter.bo.Quote;
import com.adapter.bo.Receipt;
import com.adapter.bo.StockRequest;

public class NasdaqMarket {
	public Quote getStock(String stockName) {
		Quote quote = null;

		if (stockName.equals("cipla")) {
			quote = new Quote("cipla", 30, "nasdaq", "US");
		} else if (stockName.equals("ranbaxy")) {
			quote = new Quote("ranbaxy", 23.44, "nasdaq", "US");
		}

		return quote;
	}

	public Receipt buyStock(StockRequest stockRequest) {
		Receipt receipt = null;

		receipt = new Receipt(UUID.randomUUID().toString(), stockRequest.getStockName(), stockRequest.getUnits(),
				stockRequest.getUnitPrice(), "nasdaq", "US");

		return receipt;
	}
}
