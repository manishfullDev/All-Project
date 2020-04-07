package com.ac.polling.test;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class AsyncTaxSheet {
	private final static String FINANCE_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/finance";
	private final static String EARNINGS_SUB_URI = "/{panNo}/earnings";
	private final static String INCOMETAX_RESOURCE_URI = "http://localhost:8081/async-client-demo-resource/services/incometax";
	private final static String ADVANCED_TAX_SUB_URI = "/{panNo}/advancedtax";

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		WebTarget advancedTaxWebTarget = null;
		WebTarget earningsWebTarget = null;
		ClientBuilder clientBuilder = null;
		Invocation.Builder earningsBuilder = null;
		Invocation.Builder advancedTaxBuilder = null;
		AsyncInvoker earningsInvoker = null;
		AsyncInvoker advancedTaxInvoker = null;
		Future<Response> earningsFuture = null;
		Future<Response> advancedTaxFuture = null;
		Response earningsResponse = null;
		Response advancedTaxResponse = null;
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
				"393kf04");
		earningsBuilder = earningsWebTarget.request();
		earningsInvoker = earningsBuilder.async();
		earningsFuture = earningsInvoker.get();

		advancedTaxWebTarget = client.target(INCOMETAX_RESOURCE_URI).path(ADVANCED_TAX_SUB_URI).resolveTemplate("panNo",
				"393kf04");
		advancedTaxBuilder = advancedTaxWebTarget.request();
		advancedTaxInvoker = advancedTaxBuilder.async();
		advancedTaxFuture = advancedTaxInvoker.get();

		earningsResponse = earningsFuture.get();
		if (earningsResponse.getStatus() == 200) {
			earnings = earningsResponse.readEntity(Double.class);
			taxBasedOnEarnings = ((earnings) / 100) * 10;
		}

		advancedTaxResponse = advancedTaxFuture.get();
		if (advancedTaxResponse.getStatus() == 200) {
			advancedTaxPaid = advancedTaxResponse.readEntity(Double.class);
		}

		totalTaxToBePaid = taxBasedOnEarnings - advancedTaxPaid;
		System.out.println("remaining tax : " + totalTaxToBePaid);
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println("total time : " + (end - start));
	}
}
