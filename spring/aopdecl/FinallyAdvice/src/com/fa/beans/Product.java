package com.fa.beans;

public class Product {
	protected int productNo;
	protected String productName;
	protected double price;

	public Product(int productNo, String productName, double price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", price=" + price + "]";
	}

}
