package com.imp.annon;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ FeatureConfig.class, ProductConfig.class })
public class RootConfig {

}
