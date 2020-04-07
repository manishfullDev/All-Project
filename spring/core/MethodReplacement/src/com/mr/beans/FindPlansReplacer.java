package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("findPlans")) {
			int ageGroup = 0;
			String gender = null;
			String provinceCode = null;
			int copay = 0;
			String coverageType = null;
			String networkType = null;
			int capAmount = 0;
			String[] riders = null;
			String[] plans = null;

			ageGroup = (Integer) args[0];
			gender = (String) args[1];
			provinceCode = (String) args[2];
			copay = (Integer) args[3];
			coverageType = (String) args[4];
			networkType = (String) args[5];
			capAmount = (Integer) args[6];
			riders = (String[]) args[7];

			System.out.println("ageGroup : " + ageGroup + " gender : " + gender + " provinceCode :" + provinceCode
					+ " copay : " + copay + " coverageType :" + coverageType + " networkType : " + networkType
					+ " capAmount : " + capAmount + " riders : " + riders);

			plans = new String[] { "jeevan saral", "jeevan arogya" };
			return plans;
		}
		return null;
	}

}
