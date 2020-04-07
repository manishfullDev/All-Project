package com.sjaxrs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.sjaxrs.service", "com.sjars.resource" })
public class RootConfig {

}
