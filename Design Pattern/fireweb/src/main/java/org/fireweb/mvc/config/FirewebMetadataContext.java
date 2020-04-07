package org.fireweb.mvc.config;

import java.util.Properties;

import org.fireweb.mvc.exception.UnResolvedOutcomeException;
import org.fireweb.mvc.exception.UnknownFirewebActionException;

public class FirewebMetadataContext {
	protected Properties fireWebActionConfig;
	protected Properties fireWebViewConfig;

	public FirewebMetadataContext(Properties fireWebActionConfig, Properties fireWebViewConfig) {
		this.fireWebActionConfig = fireWebActionConfig;
		this.fireWebViewConfig = fireWebViewConfig;
	}

	public String getFireWebAction(String requestPath) {
		String commandClass = null;

		if (fireWebActionConfig.containsKey(requestPath) == false) {
			throw new UnknownFirewebActionException(
					"unable to resolve the request : " + requestPath + " to fireWebAction");
		}
		commandClass = fireWebActionConfig.getProperty(requestPath);
		return commandClass;
	}

	public String getView(String outcome) {
		String page = null;

		if (fireWebViewConfig.containsKey(outcome) == false) {
			throw new UnResolvedOutcomeException("unresolved outcome  :" + outcome);
		}
		page = fireWebViewConfig.getProperty(outcome);
		return page;
	}
}
