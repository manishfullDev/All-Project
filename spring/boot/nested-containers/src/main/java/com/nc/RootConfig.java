package com.nc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nc.beans.Sensor;

@Configuration
public class RootConfig {
	@Bean
	public Sensor sensor() {
		System.out.println("sensor()");
		return new Sensor();
	}
}
