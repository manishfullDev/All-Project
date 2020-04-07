package com.ser.bean;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -2011385264286209256L;
	protected int productNo;
	protected String productName;
	protected String category;
	protected double price;

	public Product(int productNo, String productName, String category, double price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public Object writeReplace() {
		int category = 0;
		System.out.println("writeReplace()");
		if (this.category.equals("electronics")) {
			category = 1;
		} else if (this.category.equals("home appliances")) {
			category = 2;
		} else if (this.category.equals("furniture")) {
			category = 3;
		} else if (this.category.equals("footwear")) {
			category = 4;
		}
		TProduct tProduct = new TProduct(productNo, productName, category, price);
		return tProduct;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
