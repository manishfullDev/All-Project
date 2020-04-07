package com.boot.cp;

import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.boot.cp.beans.FuelTank;

@SpringBootApplication
public class ConfigurationPropertiesApplication {
	@Bean
	public Properties cpProperties() {
		YamlPropertiesFactoryBean yamlPropertiesFactoryBean = null;
		Properties cpProperties = null;

		yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
		yamlPropertiesFactoryBean.setResources(new ClassPathResource("cp.yaml"));

		cpProperties = yamlPropertiesFactoryBean.getObject();

		return cpProperties;
	}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder(ConfigurationPropertiesApplication.class)
				.build();
		// .initializers(new YamlResourceApplicationContextInitializer()).build();
		ApplicationContext context = springApplication.run(args);
		try {
			FuelTank fuelTank = context.getBean("fuelTank", FuelTank.class);
			System.out.println(fuelTank);
		} finally {
			System.exit(SpringApplication.exit(context));
		}
	}

}
