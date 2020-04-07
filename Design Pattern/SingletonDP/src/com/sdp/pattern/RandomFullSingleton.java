package com.sdp.pattern;

import java.io.Serializable;

abstract public class RandomFullSingleton implements Cloneable, Serializable {
	private static RandomFullSingleton instance;

	private RandomFullSingleton() {
	}

	public static RandomFullSingleton getInstance() {
		if (instance == null) {
			synchronized (RandomFullSingleton.class) {
				if (instance == null) {
					instance = new RandomFullSingleton() {
					};
				}
			}
		}
		return instance;
	}

	public Object readResolve() {
		return getInstance();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not allowed");
	}

}
