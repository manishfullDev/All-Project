package com.profile.annon;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile/annon/db-dev.properties")
@Profile("dev")
public class DevConfig extends BaseConfig {

}
