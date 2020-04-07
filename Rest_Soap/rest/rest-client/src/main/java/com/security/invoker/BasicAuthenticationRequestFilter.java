package com.security.invoker;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;

public class BasicAuthenticationRequestFilter implements ClientRequestFilter {
	private String username;
	private String password;

	public BasicAuthenticationRequestFilter(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		MultivaluedMap<String, Object> headers = null;

		headers = requestContext.getHeaders();
		headers.add("Authorization",
				BasicAuthenticationHelper.getBase64EncodedBasicAuthenticationHeader(username, password));
	}

}
