package org.sparkframework.web.metadata;

import java.util.ArrayList;
import java.util.List;

import org.sparkframework.web.exception.UnResolvedOutcomeException;
import org.sparkframework.web.exception.UnknownSparkActionException;

public class SparkWebMetadataContext {
	protected List<ActionMetadata> actionMetadataList;

	public SparkWebMetadataContext() {
		actionMetadataList = new ArrayList<ActionMetadata>();
	}

	public void addActionMetdata(String path, String type, List<PageForward> pageForwards) {
		ActionMetadata actionMetadata = null;

		actionMetadata = new ActionMetadata();
		actionMetadata.setPath(path);
		actionMetadata.setType(type);
		actionMetadata.setPageForwards(pageForwards);
		actionMetadataList.add(actionMetadata);
	}

	public String getSparkAction(String requestURL) {
		String sparkActionClass = null;

		for (ActionMetadata actionMetadata : actionMetadataList) {
			if (actionMetadata.getPath().equals(requestURL)) {
				sparkActionClass = actionMetadata.getType();
				break;
			}
		}
		if (sparkActionClass == null) {
			throw new UnknownSparkActionException("Unknown Spark Action");
		}
		return sparkActionClass;
	}

	public String getPage(String requestURL, String outcome) {
		List<PageForward> pageForwards = null;
		String page = null;

		for (ActionMetadata actionMetadata : actionMetadataList) {
			if (actionMetadata.getPath().equals(requestURL)) {
				pageForwards = actionMetadata.getPageForwards();
				break;
			}
		}
		if (pageForwards != null) {
			for (PageForward pageForward : pageForwards) {
				if (pageForward.getOutcome().equals(outcome)) {
					page = pageForward.getPage();
					break;
				}
			}
		}
		if (page == null) {
			throw new UnResolvedOutcomeException("outcome not found");
		}
		return page;
	}
}
