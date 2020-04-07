package com.atm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({ PersistenceConfig.class })
@ComponentScan(basePackages = { "com.atm.service", "com.atm.controller" })
@EnableTransactionManagement
public class AppConfig {

}
