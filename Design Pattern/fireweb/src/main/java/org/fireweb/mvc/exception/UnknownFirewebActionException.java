package org.fireweb.mvc.exception;

public class UnknownFirewebActionException extends FireWebException {

	public UnknownFirewebActionException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownFirewebActionException(String message) {
		super(message);
	}

}
