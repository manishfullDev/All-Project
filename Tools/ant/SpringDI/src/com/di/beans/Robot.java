package com.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private Chip chip;

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
