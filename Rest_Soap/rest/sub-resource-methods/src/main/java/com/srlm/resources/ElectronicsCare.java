package com.srlm.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

public class ElectronicsCare {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getWarrantyInfo(@QueryParam("tagNo") String tagNo) {
		return (output) -> {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<warranty-info><tag-no>").append(tagNo)
					.append("</tag-no><warrantyInDays>365</warrantyInDays></warranty-info>");
			output.write(buffer.toString().getBytes());
			output.close();
		};
	}
}
