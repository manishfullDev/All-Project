package com.jb.boot;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.jb.resources.RailEnquiryService;

@ApplicationPath("/resources")
public class JBResourceConfig extends ResourceConfig {

	public JBResourceConfig() {
		register(new RailEnquiryService());
	}

}
