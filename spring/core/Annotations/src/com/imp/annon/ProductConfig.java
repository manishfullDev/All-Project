package com.imp.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

	@Bean(autowire = Autowire.BY_NAME)
	public Product product() {
		Product product = null;
		product = new Product();
		return product;
	}
}
