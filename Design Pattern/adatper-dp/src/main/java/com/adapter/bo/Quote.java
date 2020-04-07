package com.adapter.bo;

public class Quote {
	protected String stockName;
	protected double price;
	protected String market;
	protected String currency;

	public Quote(String stockName, double price, String market, String currency) {
		this.stockName = stockName;
		this.price = price;
		this.market = market;
		this.currency = currency;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Quote [stockName=" + stockName + ", price=" + price + ", market=" + market + ", currency=" + currency
				+ "]";
	}

}
