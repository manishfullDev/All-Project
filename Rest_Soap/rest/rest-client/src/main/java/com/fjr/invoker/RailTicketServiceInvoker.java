package com.fjr.invoker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class RailTicketServiceInvoker {

	public String pnrStatus(String pnrNo) {
		Invocation.Builder iBuilder = null;
		Invocation invocation = null;
		ClientBuilder builder = null;
		WebTarget target = null;
		Response response = null;
		String ticketStatus = null;
		Client client = null;

		try {
			/*
			 * builder = ClientBuilder.newBuilder(); client = builder.build(); target =
			 * client.target("http://localhost:8081/first-jersey-rest/services/ticket");
			 * target = target.queryParam("pnrNo", pnrNo);
			 * 
			 * 
			 * iBuilder = target.request(); invocation = iBuilder.buildGet(); response =
			 * invocation.invoke();
			 * 
			 * response = target.request().get(); if(response.getStatus() == 200) {
			 * ticketStatus = response.readEntity(String.class); }
			 */
			ticketStatus = ClientBuilder.newBuilder().build()
					.target("http://localhost:8081/first-jersey-rest/services/ticket").queryParam("pnrNo", pnrNo)
					.request().get(String.class);
		} finally {
			if (client != null) {
				client.close();
			}
		}

		return ticketStatus;
	}

}












