package com.ri.headers.resource;

import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

@Path("/cab")
public class CabResource {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String bookCab(@Context HttpHeaders httpHeaders) {
		Map<String, Cookie> cookies = null;
		StringBuffer buffer = new StringBuffer();
		MultivaluedMap<String, String> headers = null;

		headers = httpHeaders.getRequestHeaders();
		buffer.append("headers : [").append(extractMultiValuedMap(headers)).append(" ] cookies : [");

		cookies = httpHeaders.getCookies();
		for (String cookieName : cookies.keySet()) {
			Cookie c = cookies.get(cookieName);
			buffer.append(cookieName).append(": [ ").append(c.getValue()).append(" ] ");
		}

		return buffer.toString();
	}

	private String extractMultiValuedMap(MultivaluedMap<String, String> matrixParameters) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		for (String paramName : matrixParameters.keySet()) {
			buffer.append(" ").append(paramName).append(": [ ").append(matrixParameters.get(paramName).toString())
					.append(" ] ");
		}

		return buffer.toString();
	}
}
