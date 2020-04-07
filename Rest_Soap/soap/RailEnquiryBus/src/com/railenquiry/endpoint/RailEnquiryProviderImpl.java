package com.railenquiry.endpoint;

import java.util.Random;

import javax.jws.WebService;

@WebService(endpointInterface = "com.railenquiry.endpoint.RailEnquiryProvider", serviceName = "RailEnquiryProviderService", portName = "RailEnquiryProviderSOAPPort")
public class RailEnquiryProviderImpl {
	public String pnrStatus(String pnrNo) {
		Random random = new Random(100);
		return "Pnr no  : " + pnrNo + " status  : WL : " + random.nextInt();
	}

}
