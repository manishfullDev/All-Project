package com.decorator.dth.packages.factory;

import com.decorator.dth.packages.NorthDhamalMixPackage;
import com.decorator.dth.packages.Package;
import com.decorator.dth.packages.SouthSupervaluePackage;
import com.decorator.dth.topup.KidsTopupPackage;
import com.decorator.dth.topup.SportsTopupPackage;

public class DTHPackageFactory {

	public static Package getPackage(String packageName, String[] topups) {
		Package dthPackage = null;

		if (packageName.equals("south super value")) {
			dthPackage = new SouthSupervaluePackage();
		} else if (packageName.equals("north dhamal mix")) {
			dthPackage = new NorthDhamalMixPackage();
		}

		for (String topup : topups) {
			if (topup.equals("kids")) {
				dthPackage = new KidsTopupPackage(dthPackage);
			} else if (topup.equals("sports")) {
				dthPackage = new SportsTopupPackage(dthPackage);
			}
		}

		return dthPackage;
	}

}
