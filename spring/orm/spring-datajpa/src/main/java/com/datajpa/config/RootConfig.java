package com.datajpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(PersistenceConfig.class)
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.datajpa.service" })
public class RootConfig {

}
