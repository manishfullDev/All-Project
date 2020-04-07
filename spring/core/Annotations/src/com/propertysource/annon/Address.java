package com.propertysource.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({ @PropertySource("classpath:com/propertysource/annon/address.properties") })
public class Address {
	@Value("${address.addressLine1}")
	private String addressLine1;
	@Value("${address.state}")
	private String state;
	@Value("${address.city}")
	private String city;
	@Value("${address.zip}")
	private int zip;
	@Value("${address.country}")
	private String country;

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", state=" + state + ", city=" + city + ", zip=" + zip
				+ ", country=" + country + "]";
	}

}
