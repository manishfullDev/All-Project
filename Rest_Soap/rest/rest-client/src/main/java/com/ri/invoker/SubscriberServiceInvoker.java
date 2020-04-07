package com.ri.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class SubscriberServiceInvoker {
	private final String ROOT_RESOURCE_URI = "http://localhost:8082/resource-injection/services/subscriber";
	private Client client;

	public SubscriberServiceInvoker() {
		client = ClientBuilder.newClient();
	}

	public String subscribe(String subscriptionPayload, String agentCode) {
		String payload = null;
		Response response = null;
		WebTarget target = null;
		Invocation invocation = null;
		Invocation.Builder builder = null;

		target = client.target(ROOT_RESOURCE_URI);
		builder = target.request().header("agentCode", agentCode);
		invocation = builder.buildPost(Entity.xml(subscriptionPayload));

		response = invocation.invoke();
		if (response.getStatus() == 200) {
			response.bufferEntity();
			payload = response.readEntity(String.class);
		}

		return payload;
	}
}
