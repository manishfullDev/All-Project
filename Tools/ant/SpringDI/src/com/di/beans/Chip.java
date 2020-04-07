package com.di.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chip {
	@Value("${chipNo}")
	private int chipNo;
	@Value("${chipType}")
	private String chipType;

	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipType=" + chipType + "]";
	}

}
