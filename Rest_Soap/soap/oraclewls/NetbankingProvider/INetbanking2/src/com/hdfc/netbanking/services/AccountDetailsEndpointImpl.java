package com.hdfc.netbanking.services;

import com.hdfc.netbanking.types.Account;

import javax.jws.WebService;

@WebService(serviceName = "AccountDetailsEndpointService", targetNamespace = "http://www.hdfc.com/netbanking/services",
            portName = "AccountDetailsEndpointSOAP11Port",
            endpointInterface = "com.hdfc.netbanking.services.AccountDetailsEndpoint",
            wsdlLocation = "/WEB-INF/wsdl/AccountDetailsEndpointService.wsdl")
public class AccountDetailsEndpointImpl {
    public Account getAccount(String in) {
        Account account = null;
        account = new Account();
        account.setAccountNo(in);
        account.setAccountHolderName("Robert Smith");
        account.setBalance(9839.34f);
        return account;
    }
}
