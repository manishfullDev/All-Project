package com.bbs.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chip {
	@Value("${chipNo}")
	protected int chipNo;
	@Value("${chipType}")
	protected String chipType;
	@Value("${manufacturer}")
	protected String manufacturer;

	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipType=" + chipType + ", manufacturer=" + manufacturer + "]";
	}

}
