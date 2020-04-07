package com.jcsa.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// source code
@Component
public class Address {
	@Value("${addressLine1}")
	private String addressLine1;
	@Value("${city}")
	private String city;
	@Value("${zip}")
	private int zip;
	@Value("${country}")
	private String country;

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", zip=" + zip + ", country=" + country
				+ "]";
	}

}
