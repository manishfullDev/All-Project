package com.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.di.beans" })
@PropertySource("classpath:global-in.properties")
public class JavaConfig {

}
