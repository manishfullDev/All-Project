package org.sparkframework.web.metadata.manager;

import java.util.ArrayList;
import java.util.List;

import org.sparkframework.web.config.ActionMapping;
import org.sparkframework.web.config.Outcome;
import org.sparkframework.web.config.SparkConfig;
import org.sparkframework.web.config.reader.XmlConfigReader;
import org.sparkframework.web.metadata.PageForward;
import org.sparkframework.web.metadata.SparkWebMetadataContext;

public class SparkConfigMetadataManager {
	private XmlConfigReader xmlConfigReader;

	public SparkConfigMetadataManager() {
		xmlConfigReader = new XmlConfigReader();
	}

	public SparkWebMetadataContext loadContext(String location) {
		String path = null;
		String type = null;
		SparkConfig sparkConfig = null;
		PageForward pageForward = null;
		List<PageForward> pageForwards = null;
		SparkWebMetadataContext sparkWebMetadataContext = null;

		sparkConfig = xmlConfigReader.readConfig(location);
		sparkWebMetadataContext = new SparkWebMetadataContext();

		for (ActionMapping actionMapping : sparkConfig.getActions().getActionMapping()) {
			path = actionMapping.getPath();
			type = actionMapping.getType();
			pageForwards = new ArrayList<PageForward>();

			for (Outcome outcome : actionMapping.getOutcome()) {
				pageForward = new PageForward();
				pageForward.setOutcome(outcome.getName());
				pageForward.setPage(outcome.getPage());
				pageForwards.add(pageForward);
			}
			sparkWebMetadataContext.addActionMetdata(path, type, pageForwards);
		}

		return sparkWebMetadataContext;
	}
}
