package com.dps.annon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DPSJConfig {
	@Bean
	@DependsOn("rocket")
	public LaunchPad launchPad() {
		return new LaunchPad();
	}

	@Bean
	public Rocket rocket() {
		return new Rocket();
	}
}
