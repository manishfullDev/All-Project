package com.adapter.bo;

public class Receipt {
	protected String refNo;
	protected String stockName;
	protected int units;
	protected double unitPrice;
	protected String market;
	protected String currency;

	public Receipt(String refNo, String stockName, int units, double unitPrice, String market, String currency) {
		super();
		this.refNo = refNo;
		this.stockName = stockName;
		this.units = units;
		this.unitPrice = unitPrice;
		this.market = market;
		this.currency = currency;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
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
		return "Receipt [refNo=" + refNo + ", stockName=" + stockName + ", units=" + units + ", unitPrice=" + unitPrice
				+ ", market=" + market + ", currency=" + currency + "]";
	}

}
