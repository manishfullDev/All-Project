package com.jcpi.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/jcpi/annon/radio.properties")
public class PIJavaConfig {
	@Autowired
	private Environment env;

	@Bean(initMethod = "init", destroyMethod = "shutdown")
	public Radio radio() {
		Radio radio = new Radio();
		radio.setStationNo(Integer.parseInt(env.getProperty("station")));
		radio.setVolumeLevel(Integer.parseInt(env.getProperty("volumeLevel")));
		return radio;
	}

}
