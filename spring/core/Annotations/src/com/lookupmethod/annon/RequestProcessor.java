package com.lookupmethod.annon;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestProcessor {
	private String data;

	public void process() {
		System.out.println("processing : " + data);
	}

	public void setData(String data) {
		this.data = data;
	}

}
