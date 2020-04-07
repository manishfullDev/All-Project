package com.cch.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cch.dto.CabRequest;
import com.cch.dto.Trip;
import com.cch.readers.JaxbMessageBodyReader;
import com.cch.readers.JsonMessageBodyReader;
import com.cch.writers.JaxbMessageBodyWriter;
import com.cch.writers.JsonMessageBodyWriter;

public class CabResourceInvoker {
	private final String ROOT_RESOURCE_URI = "http://localhost:8081/cust-content-handlers/services/cab";
	private Client client;

	public CabResourceInvoker() {
		client = ClientBuilder.newClient();
		client = client.register(JaxbMessageBodyReader.class).register(JaxbMessageBodyWriter.class)
				.register(JsonMessageBodyReader.class).register(JsonMessageBodyWriter.class);

	}

	public Trip rideNow(CabRequest cabRequest) {
		Trip trip = null;
		Response response = null;
		WebTarget target = null;
		Invocation invocation = null;
		Invocation.Builder builder = null;

		target = client.target(ROOT_RESOURCE_URI);
		builder = target.request().accept(MediaType.APPLICATION_JSON);
		invocation = builder.buildPost(Entity.json(cabRequest));
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			trip = response.readEntity(Trip.class);
		}

		return trip;
	}
}
