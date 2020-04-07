package com.importresource.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// source code available
@Component
public class FrequencyAnalyzer {
	@Value("${noiseFilter}")
	private boolean noiseFilter;

	public boolean isNoiseFilter() {
		return noiseFilter;
	}

	public void setNoiseFilter(boolean noiseFilter) {
		this.noiseFilter = noiseFilter;
	}

	@Override
	public String toString() {
		return "FrequencyAnalyzer [noiseFilter=" + noiseFilter + "]";
	}

}
