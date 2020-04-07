package com.rc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = {"com.rc.service"})
public class RootConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
