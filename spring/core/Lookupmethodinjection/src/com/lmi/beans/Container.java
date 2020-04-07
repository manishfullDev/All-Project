package com.lmi.beans;

abstract public class Container {

	public void acceptRequest(String data) throws InterruptedException {
		RequestProcessor requestProcessor = null;

		requestProcessor = lookupRequestProcessor();
		requestProcessor.setData(data);
		requestProcessor.process();
	}

	abstract public RequestProcessor lookupRequestProcessor();

}
