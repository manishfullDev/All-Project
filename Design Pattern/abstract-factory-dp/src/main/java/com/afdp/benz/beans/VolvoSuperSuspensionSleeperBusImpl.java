package com.afdp.benz.beans;

import com.afdp.api.beans.Bus;

public class VolvoSuperSuspensionSleeperBusImpl implements Bus {

	@Override
	public void accelarate(int speed) {
		String methodName = null;

		methodName = Thread.currentThread().getStackTrace()[0].getMethodName();
		System.out.println(methodName + " " + this.getClass().getName() + " with speed : " + speed);

	}

}
