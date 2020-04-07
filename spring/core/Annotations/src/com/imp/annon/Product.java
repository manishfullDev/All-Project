package com.imp.annon;

import java.util.List;

public class Product {
	private List<Feature> features;

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [features=" + features + "]";
	}

}
