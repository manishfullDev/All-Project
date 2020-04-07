package com.hdfc.inetbanking.endpoints;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "AccountEndpointService", portName = "AccountEndpointPort",
            endpointInterface = "com.hdfc.inetbanking.endpoints.AccountEndpoint")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class AccountEndpointImpl implements AccountEndpoint{

    @Override
    public double getAccountBalance(String accountNo) {        
        return 100.23;
    }
}
