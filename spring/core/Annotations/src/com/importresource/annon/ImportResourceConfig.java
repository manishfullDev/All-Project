package com.importresource.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/importresource/annon/radio.properties")
@ComponentScan(basePackages = { "com.importresource.annon" })
@ImportResource("classpath:com/importresource/annon/importresource-beans.xml")
public class ImportResourceConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public Radio radio() {
		return new Radio();
	}

}
