package com.bas.resource;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("/netbanking")
public class NetbankingService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/account/{accountNo}/balance")
	@RolesAllowed({ "accountholders", "staff" })
	public double getAccountBalance(@PathParam("accountNo") String accountNo, @Context SecurityContext context) {
		String userAccountNo = null;
		if (context.isUserInRole("accountholders")) {
			Principal p = context.getUserPrincipal();
			// database logic
			if (p.getName().equals("mathew")) {
				userAccountNo = "12345";
			}
			if (userAccountNo.equals(accountNo) == false) {
				throw new ForbiddenException("Not authorized");
			}
		}
		return 353.34;
	}
}
