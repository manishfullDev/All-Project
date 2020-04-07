package org.sparkframework.web.exception;

public class UnResolvedOutcomeException extends SparkWebException {

	public UnResolvedOutcomeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UnResolvedOutcomeException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnResolvedOutcomeException(String message) {
		super(message);
	}

	public UnResolvedOutcomeException(Throwable cause) {
		super(cause);
	}

}
