package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import com.aa.helper.Cache;
import com.aa.pointcut.ApplicationPointcut;

@Aspect
@Order(1)
public class CacheAspect extends ApplicationPointcut {
	private Cache cache;

	@Around("loggingAndCachePointcut()")
	public Object applyCache(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		key = methodName + "(" + args[0] + "," + args[1] + ")";
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		Object ret = pjp.proceed();
		cache.put(key, ret);
		return ret;

	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
