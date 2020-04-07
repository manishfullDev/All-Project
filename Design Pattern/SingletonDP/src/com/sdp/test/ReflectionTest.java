package com.sdp.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = null;
		Class<?>[] argsTypes = null;
		Constructor<?> defaultConstructor = null;

		argsTypes = new Class<?>[0];
		clazz = Class.forName("com.sdp.pattern.RandomFullSingleton");
		defaultConstructor = clazz.getDeclaredConstructor(argsTypes);
		defaultConstructor.setAccessible(true);
		Object obj1 = defaultConstructor.newInstance();
		Object obj2 = defaultConstructor.newInstance();
		
		System.out.println("obj1 hc : "+ obj1.hashCode());
		System.out.println("obj2 hc : " + obj2.hashCode());

	}
}
