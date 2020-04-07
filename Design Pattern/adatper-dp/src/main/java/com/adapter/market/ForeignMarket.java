package com.adapter.market;

import com.adapter.bo.Quote;
import com.adapter.bo.Receipt;
import com.adapter.bo.StockRequest;
import com.adapter.pattern.INRNasdaqMarketAdpater;

public class ForeignMarket {
	private INRNasdaqMarketAdpater adapter;

	public ForeignMarket() {
		adapter = new INRNasdaqMarketAdpater();
	}

	public void showQuote(String stockName) {
		Quote quote = null;
		quote = adapter.getStock(stockName);
		System.out.println(quote);
	}

	public void buyStock(StockRequest stockRequest) {
		Receipt receipt = null;

		receipt = adapter.buyStock(stockRequest);
		System.out.println(receipt);
	}
}
