package com.ja.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecuredServiceInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("verifying security...");
		System.out.println("proxy : " + proxy.getClass());
		System.out.println("method : " + method.getName());
		for (Object arg : args) {
			System.out.println("arg : " + arg);
		}

		return "proxy called";
	}

}
