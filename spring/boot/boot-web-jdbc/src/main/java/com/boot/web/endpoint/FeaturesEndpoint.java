package com.boot.web.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(enableByDefault = true, id = "features")
public class FeaturesEndpoint {
	@ReadOperation
	public String features() {
		return "no features";
	}
}
