package org.sparkframework.web.exception;

public class SparkWebException extends RuntimeException {

	public SparkWebException() {
		super();
	}

	public SparkWebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SparkWebException(String message, Throwable cause) {
		super(message, cause);
	}

	public SparkWebException(String message) {
		super(message);
	}

	public SparkWebException(Throwable cause) {
		super(cause);
	}

}
