package com.eh.handler;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.eh.dto.ErrorResponse;
import com.eh.exception.CardNotFoundException;

@Provider
public class CardNotFoundExceptionHandler implements ExceptionMapper<CardNotFoundException> {
	@Override
	public Response toResponse(CardNotFoundException exception) {
		ErrorResponse errorResponse = null;
		errorResponse = new ErrorResponse();
		errorResponse.addErrors("200", "card not found");

		return Response.status(Status.BAD_REQUEST).entity(Entity.json(errorResponse)).build();
	}

}
