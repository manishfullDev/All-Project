package com.lookupmethod.annon;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/*@Component*/
public class Container {

	public void receive(String data) {
		RequestProcessor requestProcessor = null;
		requestProcessor = lookupRequestProcessor();
		requestProcessor.setData(data);
		requestProcessor.process();
	}

	/* @Lookup */
	public RequestProcessor lookupRequestProcessor() {
		return null;
	}
}
