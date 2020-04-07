package com.imp.annon;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imp/annon/product-features.properties")
public class FeatureConfig {
	@Autowired
	private Environment env;

	@Autowired
	@Qualifier("displayTypeFeature")
	private Feature displayTypeFeature;

	@Autowired
	@Qualifier("soundFeature")
	private Feature soundFeature;

	@Bean
	public Feature displayTypeFeature() {
		Feature feature = new Feature();
		feature.setFeatureName("displayType");
		feature.setValue(env.getProperty("displayType"));
		return feature;
	}

	@Bean
	public Feature soundFeature() {
		Feature feature = new Feature();
		feature.setFeatureName("sound");
		feature.setValue(env.getProperty("sound"));
		return feature;
	}

	@Bean
	public List<Feature> features() {
		List<Feature> features = null;

		features = new ArrayList<Feature>();
		features.add(displayTypeFeature);
		features.add(soundFeature);
		return features;
	}
}
