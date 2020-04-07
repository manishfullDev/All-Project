package com.srlm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

public class HomeAppliancesCare {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getWarrantyInfo(@QueryParam("serialNo") String serialNo) {
		return (output) -> {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<warranty-info><serial-no>").append(serialNo)
					.append("</serial-no><expiry-date>2019-12-31</expiry-date></warranty-info>");
			output.write(buffer.toString().getBytes());
			output.close();
		};
	}
}
