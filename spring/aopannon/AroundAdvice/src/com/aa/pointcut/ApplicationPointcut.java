package com.aa.pointcut;

import org.aspectj.lang.annotation.Pointcut;

abstract public class ApplicationPointcut {
	@Pointcut("within(com.aa.beans.*)")
	public void loggingAndCachePointcut() {
	}
}
