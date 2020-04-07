package com.fjr.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Path("/ticket")
public class RailwayTicketResourse {
	@Operation(method = "pnrStatus", parameters = {
			@Parameter(name = "pnrNo", description = "pass pnrNo to verify ticket status", in = ParameterIn.QUERY, schema = @Schema(type = "string")) }, responses = {
					@ApiResponse(responseCode = "200", description = "status of the ticket", content = @Content(schema = @Schema(type = "string"))) })
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pnrStatus(@QueryParam("pnrNo") String pnrNo) {
		return "Pnr : " + pnrNo + " Status : B1,23,CNF";
	}

}
