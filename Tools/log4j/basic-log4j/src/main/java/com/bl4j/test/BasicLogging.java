package com.bl4j.test;

import org.apache.log4j.Logger;

public class BasicLogging {
	private static final Logger logger = Logger.getLogger(BasicLogging.class);

	public static void main(String[] args) {
		for (int i = 0; i < 10000000; i++) {
			logger.debug("debug statement");
			logger.info("info statement");
			logger.warn("warn statement");
			logger.error("error statement");
			logger.fatal("fatal statement");
		}
	}
}
