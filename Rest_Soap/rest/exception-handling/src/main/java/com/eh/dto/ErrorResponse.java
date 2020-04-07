package com.eh.dto;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {
	protected List<Error> errors;

	public ErrorResponse() {
		errors = new ArrayList<>();
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void addErrors(String errorCode, String cause) {
		errors.add(new Error(errorCode, cause));
	}

}
