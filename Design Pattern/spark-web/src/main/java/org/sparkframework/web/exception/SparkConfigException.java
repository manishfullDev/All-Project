package org.sparkframework.web.exception;

public class SparkConfigException extends SparkWebException {

	public SparkConfigException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SparkConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public SparkConfigException(String message) {
		super(message);
	}

	public SparkConfigException(Throwable cause) {
		super(cause);
	}

}
