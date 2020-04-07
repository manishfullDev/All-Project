package com.ta.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.ta.beans", "com.ta.aspect" })
@EnableAspectJAutoProxy
public class TAConfig {

}
