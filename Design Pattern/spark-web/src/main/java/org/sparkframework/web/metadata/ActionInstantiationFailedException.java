package org.sparkframework.web.metadata;

import org.sparkframework.web.exception.SparkWebException;

public class ActionInstantiationFailedException extends SparkWebException {
	public ActionInstantiationFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ActionInstantiationFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ActionInstantiationFailedException(String message) {
		super(message);
	}

	public ActionInstantiationFailedException(Throwable cause) {
		super(cause);
	}

}
