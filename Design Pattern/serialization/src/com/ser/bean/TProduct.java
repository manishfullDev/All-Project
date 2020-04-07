package com.ser.bean;

import java.io.Serializable;

public class TProduct implements Serializable {
	protected int productNo;
	protected String productName;
	protected int category;
	protected double price;

	public TProduct(int productNo, String productName, int category, double price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public Object readResolve() {
		Product product = null;
		String scategory = null;

		System.out.println("readResolve()");
		if (category == 1) {
			scategory = "electronics";
		} else if (category == 2) {
			scategory = "home appliances";
		} else if (category == 3) {
			scategory = "furniture";
		} else if (category == 4) {
			scategory = "footwear";
		}
		product = new Product(productNo, productName, scategory, price);
		return product;
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

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
