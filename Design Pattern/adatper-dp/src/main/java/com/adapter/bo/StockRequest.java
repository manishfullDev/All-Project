package com.adapter.bo;

public class StockRequest {
	protected String stockName;
	protected int units;
	protected double unitPrice;
	protected String currency;

	public StockRequest(String stockName, int units, double unitPrice, String currency) {
		super();
		this.stockName = stockName;
		this.units = units;
		this.unitPrice = unitPrice;
		this.currency = currency;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "StockRequest [stockName=" + stockName + ", units=" + units + ", unitPrice=" + unitPrice + ", currency="
				+ currency + "]";
	}

}
