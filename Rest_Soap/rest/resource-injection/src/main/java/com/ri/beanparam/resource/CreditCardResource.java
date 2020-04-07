package com.ri.beanparam.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/credit-card")
public class CreditCardResource {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{ifscCode}")
	public String newCreditCard(@BeanParam CreditCardApplication application) {
		return application.toString();
	}
}
