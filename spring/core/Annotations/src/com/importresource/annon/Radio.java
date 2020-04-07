package com.importresource.annon;

// no source code
public class Radio {
	private Receiver receiver;
	private FrequencyAnalyzer frequencyAnalyzer;

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public void setFrequencyAnalyzer(FrequencyAnalyzer frequencyAnalyzer) {
		this.frequencyAnalyzer = frequencyAnalyzer;
	}

	@Override
	public String toString() {
		return "Radio [receiver=" + receiver + ", frequencyAnalyzer=" + frequencyAnalyzer + "]";
	}

}
