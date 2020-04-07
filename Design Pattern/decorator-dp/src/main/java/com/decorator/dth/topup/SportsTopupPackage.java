package com.decorator.dth.topup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.decorator.dth.packages.Package;

public class SportsTopupPackage extends Topup {

	public SportsTopupPackage(Package dthPackage) {
		super(dthPackage);
	}

	@Override
	public List<String> getChannels() {
		List<String> channels = null;
		List<String> sportsChannels = null;

		sportsChannels = new ArrayList<String>();
		channels = super.getChannels();
		sportsChannels.addAll(Arrays.asList(new String[] { "Star Sports1", "Espn", "Ten Sports" }));
		sportsChannels.addAll(channels);

		return sportsChannels;
	}

	@Override
	public double getSubscriptionAmount() {
		double subscriptionAmount = 0;
		subscriptionAmount = super.getSubscriptionAmount() + 45;

		return subscriptionAmount;
	}

}
