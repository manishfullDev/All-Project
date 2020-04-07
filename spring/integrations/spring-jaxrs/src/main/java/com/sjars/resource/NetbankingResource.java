package com.sjars.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjaxrs.service.NetbankingService;

@Component
@Path("/banking")
public class NetbankingResource {
	@Autowired
	private NetbankingService netbankingService;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{accountNo}")
	public double getBalance(@PathParam("accountNo") String accountNo) {
		return netbankingService.getBalance(accountNo);
	}

}
