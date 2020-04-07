package com.nbf.beans;

public class Product {
	private String productName;
	private Manufacturer manufacturer;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", manufacturer=" + manufacturer + "]";
	}

}
