package com.decorator.dth.bo;

import java.util.List;

public class Subscription {
	protected String packageName;
	protected List<String> topups;
	protected List<String> channels;
	protected double amount;
	protected int days;

	public Subscription(String packageName, List<String> topups, List<String> channels, double amount, int days) {
		super();
		this.packageName = packageName;
		this.topups = topups;
		this.channels = channels;
		this.amount = amount;
		this.days = days;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<String> getTopups() {
		return topups;
	}

	public void setTopups(List<String> topups) {
		this.topups = topups;
	}

	public List<String> getChannels() {
		return channels;
	}

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
