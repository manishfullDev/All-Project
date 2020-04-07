package com.imp.annon;

public class Feature {
	private String featureName;
	private String value;

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Feature [featureName=" + featureName + ", value=" + value + "]";
	}

}
