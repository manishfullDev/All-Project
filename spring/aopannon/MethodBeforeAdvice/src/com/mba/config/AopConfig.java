package com.mba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mba.helper.SecurityHelper;

@Configuration
@ComponentScan(basePackages = { "com.mba.beans", "com.mba.aspect" })
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public SecurityHelper securityHelper() {
		SecurityHelper seucHelper = null;
		seucHelper = SecurityHelper.getInstance();
		return seucHelper;
	}
}
