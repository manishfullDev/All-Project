package org.sparkframework.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sparkframework.web.metadata.SparkWebMetadataContext;
import org.sparkframework.web.metadata.manager.SparkConfigMetadataManager;
import org.sparkframework.web.processor.SparkProcessor;

public class SparkWebServlet extends HttpServlet {
	private final String DEFAULT_SPARK_CONFIG = "/WEB-INF/spark-config.xml";
	private SparkWebMetadataContext sparkWebMetadataContext;
	private SparkProcessor sparkProcessor;

	@Override
	public void init(ServletConfig config) throws ServletException {
		String configLocation = null;
		String absoluteConfigLocation = null;
		SparkConfigMetadataManager configMetadataManager = null;

		configLocation = config.getInitParameter("config");
		if (configLocation == null) {
			configLocation = DEFAULT_SPARK_CONFIG;
		}
		absoluteConfigLocation = config.getServletContext().getRealPath("/") + configLocation;
		configMetadataManager = new SparkConfigMetadataManager();
		sparkWebMetadataContext = configMetadataManager.loadContext(absoluteConfigLocation);
		sparkProcessor = new SparkProcessor();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		sparkProcessor.process(req, resp, sparkWebMetadataContext);
	}

}
