package com.rc.test;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Binding;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.soap.SOAPBinding;

public class RechargeDispatchTest {
	public static void main(String[] args) throws SOAPException, IOException {
		Service rechargeGatewayPartnerImplService = Service
				.create(new QName("http://service.recharge.airtel.in/", "RechargeGatewayPartnerImplService"));

		rechargeGatewayPartnerImplService.addPort(
				new QName("http://service.recharge.airtel.in/", "RechargeGatewayPartnerImplPort"),
				SOAPBinding.SOAP11HTTP_BINDING, "http://localhost:8081/RechargeBus/recharge");

		Dispatch<SOAPMessage> dispatch = rechargeGatewayPartnerImplService.createDispatch(
				new QName("http://service.recharge.airtel.in/", "RechargeGatewayPartnerImplPort"), SOAPMessage.class,
				Mode.MESSAGE);

		SOAPMessage request = null;
		request = MessageFactory.newInstance().createMessage();
		SOAPBody body = request.getSOAPBody();
		SOAPElement topupElement = body.addChildElement(new QName("http://www.airtel.in/recharge/types", "topup"));

		SOAPElement mobileNoElement = topupElement.addChildElement("mobileNo");
		mobileNoElement.addTextNode("938394");

		SOAPElement circleElement = topupElement.addChildElement("circle");
		circleElement.addTextNode("TS");

		SOAPElement subscriberNameElement = topupElement.addChildElement("subscriberName");
		subscriberNameElement.addTextNode("Airtel");

		SOAPElement planNameElement = topupElement.addChildElement("planName");
		planNameElement.addTextNode("399 Plan");

		SOAPElement amountElement = topupElement.addChildElement("amount");
		amountElement.addTextNode("939");

		// request.writeTo(System.out);

		SOAPMessage response = dispatch.invoke(request);
		response.writeTo(System.out);
	}
}



















