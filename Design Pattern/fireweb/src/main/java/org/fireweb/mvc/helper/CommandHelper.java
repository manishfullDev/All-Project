package org.fireweb.mvc.helper;

import javax.servlet.http.HttpServletRequest;

import org.fireweb.mvc.action.FirewebAction;
import org.fireweb.mvc.config.FirewebMetadataContext;
import org.fireweb.mvc.exception.FirewebActionCreationFailedException;

public class CommandHelper {

	public FirewebAction getCommand(HttpServletRequest request, FirewebMetadataContext context) {
		FirewebAction action = null;
		String actionClass = null;
		String requestPath = null;

		requestPath = request.getServletPath();
		actionClass = context.getFireWebAction(requestPath);

		try {
			action = (FirewebAction) Class.forName(actionClass).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new FirewebActionCreationFailedException("instantiation failed for fireWebAction", e);
		}

		return action;
	}

}
