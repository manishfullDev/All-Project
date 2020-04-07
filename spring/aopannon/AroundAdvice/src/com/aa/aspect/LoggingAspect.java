package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import com.aa.pointcut.ApplicationPointcut;

@Aspect
@Order(2)
public class LoggingAspect extends ApplicationPointcut {
	@Around("loggingAndCachePointcut()")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		System.out.println("entered into method : " + methodName + "(" + args[0] + "," + args[1] + ")");
		Object ret = pjp.proceed();
		System.out.println("exiting from method : " + methodName + " with ret : " + ret);
		return ret;
	}
}
