package com.fjr.boot;

import java.util.Set;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.fjr.resource.RailwayTicketResourse;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;

@ApplicationPath("/services")
public class RailApplication extends ResourceConfig {

	public RailApplication() {
		register(RailwayTicketResourse.class);
		register(OpenApiResource.class);
	}


}
