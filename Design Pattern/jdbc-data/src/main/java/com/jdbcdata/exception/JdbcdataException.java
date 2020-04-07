package com.jdbcdata.exception;

public class JdbcdataException extends RuntimeException {

	public JdbcdataException() {
		super();
	}

	public JdbcdataException(String message, Throwable cause) {
		super(message, cause);
	}

	public JdbcdataException(String message) {
		super(message);
	}

	public JdbcdataException(Throwable cause) {
		super(cause);
	}

}
