package com.adapter.pattern;

import com.adapter.bo.Quote;
import com.adapter.bo.Receipt;
import com.adapter.bo.StockRequest;
import com.adapter.market.NasdaqMarket;

public class INRNasdaqMarketAdpater {
	private final double US_INR_CONVERSION_RATE = 71.23;

	private NasdaqMarket nasdaqMarket;

	public INRNasdaqMarketAdpater() {
		nasdaqMarket = new NasdaqMarket();
	}

	public Quote getStock(String stockName) {
		Quote inrQuote = null;
		Quote usQuote = null;
		double inrPrice = 0;

		usQuote = nasdaqMarket.getStock(stockName);

		inrPrice = usQuote.getPrice() * US_INR_CONVERSION_RATE;
		inrQuote = new Quote(usQuote.getStockName(), inrPrice, usQuote.getMarket(), "INR");

		return inrQuote;
	}

	public Receipt buyStock(StockRequest inrStockRequest) {
		StockRequest usStockRequest = null;
		double usStockRequestUnitPrice = 0;
		double inrStockReceiptUnitPrice = 0;
		Receipt usReceipt = null;
		Receipt inrReceipt = null;

		usStockRequestUnitPrice = inrStockRequest.getUnitPrice() / US_INR_CONVERSION_RATE;
		usStockRequest = new StockRequest(inrStockRequest.getStockName(), inrStockRequest.getUnits(),
				usStockRequestUnitPrice, "US");
		usReceipt = nasdaqMarket.buyStock(usStockRequest);
		inrStockReceiptUnitPrice = usReceipt.getUnitPrice() * US_INR_CONVERSION_RATE;
		inrReceipt = new Receipt(usReceipt.getRefNo(), usReceipt.getStockName(), usReceipt.getUnits(),
				inrStockReceiptUnitPrice, usReceipt.getMarket(), "INR");

		return inrReceipt;
	}
}
