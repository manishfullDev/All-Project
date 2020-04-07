package com.decorator.dth.topup;

import java.util.List;

import com.decorator.dth.packages.Package;

/**
 * abstract decorator
 */
abstract public class Topup implements Package {
	private Package dthPackage;

	public Topup(Package dthPackage) {
		this.dthPackage = dthPackage;
	}

	@Override
	public List<String> getChannels() {
		return dthPackage.getChannels();
	}

	@Override
	public double getSubscriptionAmount() {
		return dthPackage.getSubscriptionAmount();
	}

	@Override
	public int getValidityDays() {
		return dthPackage.getValidityDays();
	}

}
