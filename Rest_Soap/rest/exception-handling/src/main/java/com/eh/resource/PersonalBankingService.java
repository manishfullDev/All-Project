package com.eh.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.eh.dto.ErrorResponse;
import com.eh.dto.PayCardRequest;
import com.eh.dto.Receipt;
import com.eh.exception.CardNotFoundException;
import com.eh.service.CardService;

@Path("/personal-banking")
public class PersonalBankingService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/return")
	public Response payCardBill(PayCardRequest cardRequest) {
		ErrorResponse errorResponse = null;
		CardService cardService = null;
		Receipt receipt = null;

		errorResponse = new ErrorResponse();
		if (cardRequest.getAccountNo() == null || cardRequest.getAccountNo().trim().length() < 12) {
			errorResponse.addErrors("001", "please provide a account no");
		}
		if (cardRequest.getCardNo() == null || cardRequest.getCardNo().trim().length() < 16) {
			errorResponse.addErrors("002", "please provide valid card no");
		}
		if (errorResponse.getErrors().size() > 0) {
			return Response.status(Status.BAD_REQUEST).entity(Entity.json(errorResponse)).build();
		}
		try {
			cardService = new CardService();
			receipt = cardService.pay(cardRequest);
		} catch (CardNotFoundException e) {
			errorResponse.addErrors("200", "card not found");
			return Response.status(Status.BAD_REQUEST).entity(errorResponse).build();
		}

		return Response.ok(receipt).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/throw")
	public Receipt payCardBillWithThrow(PayCardRequest cardRequest) {
		ErrorResponse errorResponse = null;
		CardService cardService = null;
		Receipt receipt = null;

		errorResponse = new ErrorResponse();
		try {
			cardService = new CardService();
			receipt = cardService.pay(cardRequest);
		} catch (CardNotFoundException e) {
			errorResponse.addErrors("200", "card not found");
			Response response = Response.status(Status.BAD_REQUEST).entity(errorResponse).build();
			throw new WebApplicationException(response);
		}

		return receipt;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/handler")
	public Receipt payCardBillWithHandler(PayCardRequest cardRequest) {
		Receipt receipt = null;
		CardService cardService = null;

		cardService = new CardService();
		receipt = cardService.pay(cardRequest);

		return receipt;
	}

}
