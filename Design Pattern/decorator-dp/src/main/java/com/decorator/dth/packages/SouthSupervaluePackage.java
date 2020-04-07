package com.decorator.dth.packages;

import java.util.Arrays;
import java.util.List;

public class SouthSupervaluePackage implements Package {

	@Override
	public List<String> getChannels() {
		return Arrays.asList(new String[] { "Etv", "Maa Tv", "Gemeni Tv" });
	}

	@Override
	public double getSubscriptionAmount() {
		return 100;
	}

	@Override
	public int getValidityDays() {
		return 30;
	}

}
