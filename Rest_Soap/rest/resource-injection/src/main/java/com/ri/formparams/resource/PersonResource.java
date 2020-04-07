package com.ri.formparams.resource;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String newPerson(InputStream in) {
		StringBuffer buffer = new StringBuffer();

		Stream inStream = new BufferedReader(new InputStreamReader(in)).lines();
		inStream.forEach((l) -> {
			buffer.append(l);
		});

		return buffer.toString();
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/form")
	public String newPerson(@FormParam("personName") String personName, @FormParam("age") int age,
			@FormParam("gender") String gender) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append(" personName: [ ").append(personName).append(" ] age: [").append(age).append("] gender: [")
				.append(gender).append(" ]");
		return buffer.toString();
	}

}
