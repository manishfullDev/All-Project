package com.hdfc.inetbanking.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(targetNamespace = "http://endpoints.inetbanking.hdfc.com/")
public interface AccountEndpoint {
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebMethod(action = "http://endpoints.inetbanking.hdfc.com/getAccountBalance")
    @WebResult(name = "balance", targetNamespace = "http://endpoints.inetbanking.hdfc.com/types")
    double getAccountBalance(@WebParam(name = "accountNo",
                                       targetNamespace = "http://endpoints.inetbanking.hdfc.com/types")
                             String accountNo);
}
