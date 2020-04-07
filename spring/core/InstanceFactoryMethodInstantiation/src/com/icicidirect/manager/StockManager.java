package com.icicidirect.manager;

import com.exchange.service.StockService;

public class StockManager {
	private StockService stockService;

	public double getStockPrice(String stockName) {
		double price = 0;

		price = stockService.getStockPrice(stockName);
		return price;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

}
