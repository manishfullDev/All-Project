package com.ri.paramconverter.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/account")
public class AccountResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{accountNo}")
	public StreamingOutput getAccount(@PathParam("accountNo") AccountNo accountNo) {
		return (output) -> {
			StringBuilder builder = null;

			builder = new StringBuilder();
			builder.append("<account><branchCode>").append(accountNo.getBranchCode())
					.append("</branchCode><accountType>").append(accountNo.getAccountType())
					.append("</accountType><uniqueAccountNo>").append(accountNo.getUniqueAccountNo())
					.append("</uniqueAccountNo><accountHolderName>Samuel</accountHolderName><balance>1029</balance></account>");
			output.write(builder.toString().getBytes());
			output.close();
		};
	}
}
