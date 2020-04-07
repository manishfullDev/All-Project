package com.ja.factory;

import java.lang.reflect.Proxy;

import com.ja.handler.SecuredServiceInvocationHandler;

public class SecurityFactory {
	public static Object createSecuredObjects(Class<?> clazz) {
		Object proxy = null;

		proxy = Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[] { clazz },
				new SecuredServiceInvocationHandler());

		return proxy;
	}
}
