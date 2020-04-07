package com.icicidirect.helper;

import com.exchange.service.BSEStockServiceImpl;
import com.exchange.service.NSEStockServiceImpl;
import com.exchange.service.StockService;

public class StockServiceLocator {
	public StockService locateStockService(String exchange) {
		StockService stockService = null;

		// should write here lookup logic to jndi registry since we dont have
		// implementation classes with us
		if (exchange.equals("bse")) {
			stockService = new BSEStockServiceImpl();
		} else {
			stockService = new NSEStockServiceImpl();
		}

		return stockService;
	}
}
