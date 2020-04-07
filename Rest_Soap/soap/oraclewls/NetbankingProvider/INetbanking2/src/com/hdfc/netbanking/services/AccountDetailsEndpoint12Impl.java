package com.hdfc.netbanking.services;

import com.hdfc.netbanking.types.Account;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "AccountDetailsEndpointService", targetNamespace = "http://www.hdfc.com/netbanking/services",
            portName = "AccountDetailsEndpointSOAP12Port",
            endpointInterface = "com.hdfc.netbanking.services.AccountDetailsEndpoint",
            wsdlLocation = "/WEB-INF/wsdl/AccountDetailsEndpointService.wsdl")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class AccountDetailsEndpoint12Impl implements AccountDetailsEndpoint {

    @Override
    public Account getAccount(String in) {
        Account account = null;
        account = new Account();
        account.setAccountNo(in);
        account.setAccountHolderName("Will Smith");
        account.setBalance(19839.34f);
        return account;
    }
}
