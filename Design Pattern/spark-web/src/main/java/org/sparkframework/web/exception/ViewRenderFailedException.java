package org.sparkframework.web.exception;

public class ViewRenderFailedException extends SparkWebException {

	public ViewRenderFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ViewRenderFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ViewRenderFailedException(String message) {
		super(message);
	}

	public ViewRenderFailedException(Throwable cause) {
		super(cause);
	}

}
