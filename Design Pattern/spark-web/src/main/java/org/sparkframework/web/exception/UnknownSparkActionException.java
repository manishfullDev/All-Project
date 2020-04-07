package org.sparkframework.web.exception;

public class UnknownSparkActionException extends SparkWebException {

	public UnknownSparkActionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UnknownSparkActionException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownSparkActionException(String message) {
		super(message);
	}

	public UnknownSparkActionException(Throwable cause) {
		super(cause);
	}

}
