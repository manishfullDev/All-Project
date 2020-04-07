package com.axisbank.netbanking.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.9 2019-10-23T10:07:01.326+05:30
 * Generated source version: 2.6.9
 * 
 */
@WebService(targetNamespace = "http://www.axisbank.com/netbanking/services", name = "netbanking")
@XmlSeeAlso({ com.axisbank.netbanking.types.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Netbanking {

	@WebMethod(action = "http://www.axisbank.com/netbanking/services/withdrawl")
	@WebResult(name = "receipt", targetNamespace = "http://www.axisbank.com/netbanking/types", partName = "out")
	public com.axisbank.netbanking.types.Receipt withdrawl(
			@WebParam(partName = "in", name = "withdrawlInfo", targetNamespace = "http://www.axisbank.com/netbanking/types") com.axisbank.netbanking.types.WithdrawlInfo in);
}
