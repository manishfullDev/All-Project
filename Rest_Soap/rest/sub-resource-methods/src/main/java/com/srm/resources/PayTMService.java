package com.srm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/payTM")
public class PayTMService {
	@Path("/wallet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getWalletBalance(@QueryParam("mobileNo") String mobileNo) {
		return 393.34;
	}

	@Path("/voucher")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getGiftVoucherBalance(@QueryParam("mobileNo") String mobileNo) {
		return 500.34;
	}
}
