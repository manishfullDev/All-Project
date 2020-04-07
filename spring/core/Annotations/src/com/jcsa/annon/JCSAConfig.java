package com.jcsa.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/jcsa/annon/appvalues.properties")
@ComponentScan(basePackages = { "com.jcsa.annon" })
public class JCSAConfig {
	@Autowired
	private Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public Letter letter() {
		Letter letter = new Letter();
		letter.setSubject(env.getProperty("subject"));
		letter.setMessage(env.getProperty("message"));
		return letter;
	}

}
