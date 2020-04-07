package com.railenquiry.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "RailEnquiryProvider", targetNamespace = "http://www.irctc.co.in/enquiry/service")
public interface RailEnquiryProvider {
	@WebResult(name = "status", targetNamespace = "http://www.irctc.co.in/enquiry/types")
	@WebMethod(action = "http://www.irctc.co.in/enquiry/service/pnrStatus")
	String pnrStatus(@WebParam(name = "pnrNo", targetNamespace = "http://www.irctc.co.in/enquiry/types") String pnrNo);
}
