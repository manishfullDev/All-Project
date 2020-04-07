package com.unm.beans;

import java.util.List;

public class Product {
	private String productName;
	private List<String> specifications;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSpecifications(List<String> specifications) {
		this.specifications = specifications;
	}

	public String getProductName() {
		return productName;
	}

	public List<String> getSpecifications() {
		return specifications;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", specifications=" + specifications + "]";
	}

}
