package com.ara.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = { "com.ara.beans", "com.ara.aspect" })
@EnableAspectJAutoProxy
@Configuration
public class ARAConfig {

}
