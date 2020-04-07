package com.bas.boot;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.bas.resource.NetbankingService;

public class BasicAuthApplication extends Application {
	private Set<Class<?>> classes;
	private Set<Object> singletons;

	public BasicAuthApplication() {
		singletons = new HashSet<>();
		classes = new HashSet<>();

		singletons.add(new NetbankingService());
		classes.add(RolesAllowedDynamicFeature.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
