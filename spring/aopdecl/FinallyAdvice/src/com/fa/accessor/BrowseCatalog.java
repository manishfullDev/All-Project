package com.fa.accessor;

import java.util.Arrays;
import java.util.List;

import com.fa.beans.Product;
import com.fa.exception.ProductNotFoundException;

public class BrowseCatalog {
	public List<Product> browseCategories(String categoryName) {
		List<Product> products = null;

		products = Arrays.asList(new Product[] { new Product(1, "Mi Note 7", 3938), new Product(2, "Iphone x", 3939) });
		return products;
	}

	public Product getProduct(int productNo) {
		if (productNo <= 0) {
			throw new ProductNotFoundException("Product is not available");
		}
		return new Product(3, "Samsung Galaxy Note 10", 394094);
	}
}
