package com.decorator.dth.packages;

import java.util.Arrays;
import java.util.List;

public class NorthDhamalMixPackage implements Package {

	@Override
	public List<String> getChannels() {
		return Arrays.asList(new String[] { "Ndtv", "Bhakthi Channel", "Suprabhat", "Tele Shopping" });
	}

	@Override
	public double getSubscriptionAmount() {
		return 230;
	}

	@Override
	public int getValidityDays() {
		return 30;
	}

}
