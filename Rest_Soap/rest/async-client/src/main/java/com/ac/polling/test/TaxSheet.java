package com.ac.polling.test;

import java.util.Calendar;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class TaxSheet {
	private final static String FINANCE_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/finance";
	private final static String EARNINGS_SUB_URI = "/{panNo}/earnings";
	private final static String INCOMETAX_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/incometax";
	private final static String ADVANCED_TAX_SUB_URI = "/{panNo}/advancedtax";

	public static void main(String[] args) {
		WebTarget advancedTaxWebTarget = null;
		WebTarget earningsWebTarget = null;
		ClientBuilder clientBuilder = null;
		Invocation.Builder earningsBuilder = null;
		Invocation.Builder advancedTaxBuilder = null;
		Invocation earningsInvocation = null;
		Invocation advancedTaxInvocation = null;
		Response earningsResponse = null;
		Response advancedResponse = null;
		Client client = null;
		double earnings = 0;
		double taxBasedOnEarnings = 0;
		double advancedTaxPaid = 0;
		double totalTaxToBePaid = 0;
		long start = 0;
		long end = 0;

		start = Calendar.getInstance().getTimeInMillis();
		clientBuilder = ClientBuilder.newBuilder();
		client = clientBuilder.build();
		earningsWebTarget = client.target(FINANCE_RESOURCE_URI).path(EARNINGS_SUB_URI).resolveTemplate("panNo",
				"oe39484");
		earningsBuilder = earningsWebTarget.request();
		earningsInvocation = earningsBuilder.buildGet();
		earningsResponse = earningsInvocation.invoke();

		if (earningsResponse.getStatus() == 200) {
			earnings = earningsResponse.readEntity(Double.class);
			taxBasedOnEarnings = ((earnings) / 100) * 10;
		}
		advancedTaxWebTarget = client.target(INCOMETAX_RESOURCE_URI).path(ADVANCED_TAX_SUB_URI).resolveTemplate("panNo",
				"oe39484");
		System.out.println("received earnings amount");

		advancedTaxBuilder = advancedTaxWebTarget.request();
		advancedTaxInvocation = advancedTaxBuilder.buildGet();
		advancedResponse = advancedTaxInvocation.invoke();
		if (advancedResponse.getStatus() == 200) {
			advancedTaxPaid = advancedResponse.readEntity(Double.class);
		}
		System.out.println("received advanced tax paid amount");

		totalTaxToBePaid = taxBasedOnEarnings - advancedTaxPaid;
		System.out.println("remaining tax : " + totalTaxToBePaid);
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println("total time : " + (end - start));
	}
}
