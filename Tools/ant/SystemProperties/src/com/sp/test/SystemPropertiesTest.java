package com.sp.test;

import java.util.Properties;

public class SystemPropertiesTest {
	public static void main(String[] args) {
		Properties props = null;
		props = System.getProperties();
		for (Object key : props.keySet()) {
			System.out.println("key : " + key + " value : " + props.getProperty((String) key));
		}
	}
}
