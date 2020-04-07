package org.fireweb.mvc.exception;

public class FireWebException extends RuntimeException {

	public FireWebException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FireWebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FireWebException(String message, Throwable cause) {
		super(message, cause);
	}

	public FireWebException(String message) {
		super(message);
	}

	public FireWebException(Throwable cause) {
		super(cause);
	}

}
