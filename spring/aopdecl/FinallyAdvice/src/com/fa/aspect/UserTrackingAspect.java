package com.fa.aspect;

import org.aspectj.lang.JoinPoint;

public class UserTrackingAspect {

	public void trackBrowseHistory(JoinPoint jp) {
		String methodName = null;
		Object[] args = null;

		methodName = jp.getSignature().getName();
		args = jp.getArgs();
		
		if (methodName.equals("browseCategory")) {
			System.out.println("browing type : category and categoryName : " + args[0]);
		} else if (methodName.equals("getProduct")) {
			System.out.println("browsing type : product and product code : " + args[0]);
		}
	}
}
