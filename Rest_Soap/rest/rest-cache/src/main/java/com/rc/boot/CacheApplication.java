package com.rc.boot;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.cch.readers.JsonMessageBodyReader;
import com.cch.writers.JsonMessageBodyWriter;
import com.rc.cg.resource.NetbankingService;

@ApplicationPath("/services")
public class CacheApplication extends ResourceConfig {
	public CacheApplication() {
		register(new NetbankingService());
		register(JsonMessageBodyReader.class);
		register(JsonMessageBodyWriter.class);
	}

}
