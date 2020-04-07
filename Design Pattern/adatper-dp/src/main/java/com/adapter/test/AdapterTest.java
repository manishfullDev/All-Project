package com.adapter.test;

import com.adapter.market.ForeignMarket;

public class AdapterTest {
	public static void main(String[] args) {
		ForeignMarket foreignMarket = null;
		
		foreignMarket = new ForeignMarket();
		foreignMarket.showQuote("cipla");
	}
}
