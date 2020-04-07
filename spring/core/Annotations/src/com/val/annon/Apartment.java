package com.val.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Apartment {
	@Value("#{appValues.Apartment_apartmentType}")
	private String aparmentType;
	@Value("#{appValues.Apartment_facing}")
	private String facing;
	@Value("#{appValues.Apartment_floor}")
	private int floor;

	@Override
	public String toString() {
		return "Apartment [aparmentType=" + aparmentType + ", facing=" + facing + ", floor=" + floor + "]";
	}

}
