package com.decorator.dth.topup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.decorator.dth.packages.Package;

public class KidsTopupPackage extends Topup {

	public KidsTopupPackage(Package dthPackage) {
		super(dthPackage);
	}

	@Override
	public List<String> getChannels() {
		List<String> channels = null;
		List<String> kidsChannels = null;

		kidsChannels = new ArrayList<>();
		channels = super.getChannels();
		kidsChannels.addAll(Arrays.asList(new String[] { "Pogo", "Disney Network", "Cartoon Network" }));
		kidsChannels.addAll(channels);

		return kidsChannels;
	}

	@Override
	public double getSubscriptionAmount() {
		double subscriptionAmount = 0;
		subscriptionAmount = super.getSubscriptionAmount() + 30;

		return subscriptionAmount;
	}

}
