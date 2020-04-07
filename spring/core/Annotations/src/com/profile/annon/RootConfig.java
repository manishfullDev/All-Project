package com.profile.annon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@Import({ DevConfig.class, TestConfig.class })
@ComponentScan(basePackages = { "com.profile.annon" })
public class RootConfig {

}
