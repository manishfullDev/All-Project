package com.pdp.exception;

public class AlbumGenericException extends RuntimeException {

	public AlbumGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlbumGenericException(String message) {
		super(message);
	}

	public AlbumGenericException(Throwable cause) {
		super(cause);
	}

}
