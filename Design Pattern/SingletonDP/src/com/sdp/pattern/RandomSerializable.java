package com.sdp.pattern;

import java.io.Serializable;

public class RandomSerializable implements Serializable {
	private static RandomSerializable instance;

	private RandomSerializable() {
	}

	public Object readResolve() {
		return getInstance();
	}

	public static RandomSerializable getInstance() {
		if (instance == null) {
			synchronized (RandomSerializable.class) {
				if (instance == null) {
					instance = new RandomSerializable();
				}
			}
		}
		return instance;
	}
}
