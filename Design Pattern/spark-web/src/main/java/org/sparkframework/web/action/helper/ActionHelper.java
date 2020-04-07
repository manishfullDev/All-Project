package org.sparkframework.web.action.helper;

import org.sparkframework.web.action.SparkAction;
import org.sparkframework.web.metadata.ActionInstantiationFailedException;
import org.sparkframework.web.metadata.SparkWebMetadataContext;

public class ActionHelper {
	public SparkAction getSparkAction(String requestURL, SparkWebMetadataContext context) {
		String sparkActionClass = null;
		SparkAction action = null;

		try {
			sparkActionClass = context.getSparkAction(requestURL);
			action = (SparkAction) Class.forName(sparkActionClass).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ActionInstantiationFailedException("failed creating spark action", e);
		}

		return action;
	}
}
