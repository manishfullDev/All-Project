package com.ri.headerparams.resource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/subscriber")
public class SubscriberService {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	public String subscribe(InputStream in, @HeaderParam("agentCode") String agentCode) {
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = null;

		reader = new BufferedReader(new InputStreamReader(in));
		Stream<String> lines = reader.lines();

		lines.forEach((l) -> {
			buffer.append(l);
		});

		buffer.append(" agentCode : [ ").append(agentCode).append(" ]");

		return buffer.toString();
	}

}
