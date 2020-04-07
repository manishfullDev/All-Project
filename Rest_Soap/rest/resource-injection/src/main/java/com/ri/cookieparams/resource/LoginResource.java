package com.ri.cookieparams.resource;

import javax.ws.rs.CookieParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")
public class LoginResource {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String login(@CookieParam("username") String username) {
		return username;
	}
}
