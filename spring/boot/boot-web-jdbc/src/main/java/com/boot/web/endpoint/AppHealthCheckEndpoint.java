package com.boot.web.endpoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AppHealthCheckEndpoint implements HealthIndicator {
	@Override
	public Health health() {		
		return Health.down().build();
	}

}
