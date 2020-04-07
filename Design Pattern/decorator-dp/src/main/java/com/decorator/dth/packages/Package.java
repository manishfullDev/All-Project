package com.decorator.dth.packages;

import java.util.List;

public interface Package {
	List<String> getChannels();

	double getSubscriptionAmount();

	int getValidityDays();
}
