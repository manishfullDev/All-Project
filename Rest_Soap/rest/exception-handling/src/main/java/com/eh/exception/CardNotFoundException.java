package com.eh.exception;

public class CardNotFoundException extends RuntimeException {

	public CardNotFoundException() {
		super();
	}

	public CardNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CardNotFoundException(String message) {
		super(message);
	}

}
