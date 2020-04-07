package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public Object log(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;

		System.out.println("x: " + x);

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		System.out.print("entered into method : " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		Object ret = pjp.proceed();
		System.out.println("exiting from method : " + methodName + " with ret : " + ret);
		return ret;
	}
}
