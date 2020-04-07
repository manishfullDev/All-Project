package com.boot.web.endpoint;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class AppInfoEndpoint implements InfoContributor {
	@Override
	public void contribute(Builder builder) {
		builder.withDetail("author", "sriman").withDetail("version", "1.0.0").withDetail("license", "GPL").build();
	}

}
