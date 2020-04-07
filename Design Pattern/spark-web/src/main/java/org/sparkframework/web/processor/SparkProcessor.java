package org.sparkframework.web.processor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sparkframework.web.action.SparkAction;
import org.sparkframework.web.action.helper.ActionHelper;
import org.sparkframework.web.context.MapContextObject;
import org.sparkframework.web.context.helper.ContextObjectFactory;
import org.sparkframework.web.dispatcher.Dispatcher;
import org.sparkframework.web.metadata.SparkWebMetadataContext;

public class SparkProcessor {
	private ActionHelper actionHelper;
	private Dispatcher dispatcher;
	private ContextObjectFactory contextObjectFactory;

	public SparkProcessor() {
		dispatcher = new Dispatcher();
		actionHelper = new ActionHelper();
		contextObjectFactory = new ContextObjectFactory();
	}

	public void process(HttpServletRequest request, HttpServletResponse response,
			SparkWebMetadataContext sparkWebMetadataContext) {
		String outcome = null;
		String requestURL = null;
		SparkAction sparkAction = null;
		MapContextObject mapContextObject = null;

		requestURL = request.getServletPath();

		sparkAction = actionHelper.getSparkAction(requestURL, sparkWebMetadataContext);

		mapContextObject = contextObjectFactory.createMapContextObject(request);
		outcome = sparkAction.execute(mapContextObject);
		contextObjectFactory.bindData(request, mapContextObject);

		dispatcher.dispatch(request, response, requestURL, outcome, sparkWebMetadataContext);
	}
}
