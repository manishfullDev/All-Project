package com.security.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class NetbankingServiceInvoker {
	private final String NETBANKING_SERVICE_URI = "http://localhost:8082/basic-auth-security/secured/netbanking";
	private final String ACCOUNT_SUB_URI = "/account/{accountNo}/balance";
	private Client client;

	public NetbankingServiceInvoker() {
		client = ClientBuilder.newClient();
	}

	public double getAccountBalance(String accountNo, String username, String password) {
		double balance = 0;
		Response response = null;
		client.register(new BasicAuthenticationRequestFilter(username, password));
		response = client.target(NETBANKING_SERVICE_URI).path(ACCOUNT_SUB_URI).resolveTemplate("accountNo", accountNo)
				.request().get();
		if (response.getStatus() == 200) {
			balance = response.readEntity(Double.class);
		} else {
			System.out.println("request failed with status code : " + response.getStatus());
		}

		return balance;
	}
}
