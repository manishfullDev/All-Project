package com.jb.boot;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.jb.resources.RailEnquiryService;

/*@ApplicationPath("/api")*/
public class JBApplication extends Application {
	private Set<Object> singletons;
	private Set<Class<?>> classes;

	public JBApplication() {
		singletons = new HashSet<>();
		classes = new HashSet<>();

		singletons.add(new RailEnquiryService());
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
