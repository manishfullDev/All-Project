package com.payment.axis.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.payment.axisbank.dto.Receipt;
import com.payment.axisbank.dto.WithdrawlInfo;

@WebService(name = "netbanking", targetNamespace = "http://www.axisbank.com/netbanking/service")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface Netbanking {
	@WebMethod(action = "http://www.axisbank.com/netbanking/services/withdrawl")
	@WebResult(name = "receipt", targetNamespace = "http://www.axisbank.com/netbanking/types")
	Receipt withdrawl(
			@WebParam(name = "withdrawlInfo", targetNamespace = "http://www.axisbank.com/netbanking/types") WithdrawlInfo withdrawlInfo);
}
