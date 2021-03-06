
package com.hdfc.netbanking.services;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "AccountDetailsEndpointService", targetNamespace = "http://www.hdfc.com/netbanking/services",
                  wsdlLocation =
                  "http://192.168.56.1:7101/NetbankingProvider-INetbanking2-context-root/AccountDetailsEndpointSOAP12Port?wsdl#%7Bhttp%3A%2F%2Fwww.hdfc.com%2Fnetbanking%2Fservices%7DAccountDetailsEndpointService")
public class AccountDetailsEndpointService extends Service {

    private final static URL ACCOUNTDETAILSENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTDETAILSENDPOINTSERVICE_EXCEPTION;
    private final static QName ACCOUNTDETAILSENDPOINTSERVICE_QNAME =
        new QName("http://www.hdfc.com/netbanking/services", "AccountDetailsEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.56.1:7101/NetbankingProvider-INetbanking2-context-root/AccountDetailsEndpointSOAP12Port?wsdl#%7Bhttp%3A%2F%2Fwww.hdfc.com%2Fnetbanking%2Fservices%7DAccountDetailsEndpointService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTDETAILSENDPOINTSERVICE_WSDL_LOCATION = url;
        ACCOUNTDETAILSENDPOINTSERVICE_EXCEPTION = e;
    }

    public AccountDetailsEndpointService() {
        super(__getWsdlLocation(), ACCOUNTDETAILSENDPOINTSERVICE_QNAME);
    }

    public AccountDetailsEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTDETAILSENDPOINTSERVICE_QNAME, features);
    }

    public AccountDetailsEndpointService(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTDETAILSENDPOINTSERVICE_QNAME);
    }

    public AccountDetailsEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTDETAILSENDPOINTSERVICE_QNAME, features);
    }

    public AccountDetailsEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountDetailsEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AccountDetailsEndpoint
     */
    @WebEndpoint(name = "AccountDetailsEndpointSOAP11Port")
    public AccountDetailsEndpoint getAccountDetailsEndpointSOAP11Port() {
        return super.getPort(new QName("http://www.hdfc.com/netbanking/services", "AccountDetailsEndpointSOAP11Port"),
                             AccountDetailsEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountDetailsEndpoint
     */
    @WebEndpoint(name = "AccountDetailsEndpointSOAP11Port")
    public AccountDetailsEndpoint getAccountDetailsEndpointSOAP11Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.hdfc.com/netbanking/services", "AccountDetailsEndpointSOAP11Port"),
                             AccountDetailsEndpoint.class, features);
    }

    /**
     *
     * @return
     *     returns AccountDetailsEndpoint
     */
    @WebEndpoint(name = "AccountDetailsEndpointSOAP12Port")
    public AccountDetailsEndpoint getAccountDetailsEndpointSOAP12Port() {
        return super.getPort(new QName("http://www.hdfc.com/netbanking/services", "AccountDetailsEndpointSOAP12Port"),
                             AccountDetailsEndpoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountDetailsEndpoint
     */
    @WebEndpoint(name = "AccountDetailsEndpointSOAP12Port")
    public AccountDetailsEndpoint getAccountDetailsEndpointSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.hdfc.com/netbanking/services", "AccountDetailsEndpointSOAP12Port"),
                             AccountDetailsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTDETAILSENDPOINTSERVICE_EXCEPTION != null) {
            throw ACCOUNTDETAILSENDPOINTSERVICE_EXCEPTION;
        }
        return ACCOUNTDETAILSENDPOINTSERVICE_WSDL_LOCATION;
    }

}
