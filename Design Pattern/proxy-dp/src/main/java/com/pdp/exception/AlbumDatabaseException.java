package com.pdp.exception;

public class AlbumDatabaseException extends AlbumGenericException {

	public AlbumDatabaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlbumDatabaseException(String message) {
		super(message);
	}

	public AlbumDatabaseException(Throwable cause) {
		super(cause);
	}

}
