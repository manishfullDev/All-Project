package com.afdp.ashok.beans;

import com.afdp.api.beans.Truck;

public class GeneralPurposeTruckImpl implements Truck {

	@Override
	public void carrier(String action) {
		String methodName = null;

		methodName = Thread.currentThread().getStackTrace()[0].getMethodName();
		System.out.println(methodName + " " + this.getClass().getName() + " with action : " + action);

	}

}
