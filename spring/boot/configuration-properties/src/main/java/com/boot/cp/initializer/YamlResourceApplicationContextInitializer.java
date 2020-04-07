package com.boot.cp.initializer;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

public class YamlResourceApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		YamlPropertySourceLoader yamlPropertySourceLoader = null;
		List<PropertySource<?>> propertySources = null;
		Environment env = null;

		env = applicationContext.getEnvironment();
		yamlPropertySourceLoader = new YamlPropertySourceLoader();
		try {
			propertySources = yamlPropertySourceLoader.load("cp", applicationContext.getResource("cp.yaml"));
			for (PropertySource<?> propertySource : propertySources) {
				((ConfigurableEnvironment) env).getPropertySources().addLast(propertySource);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
