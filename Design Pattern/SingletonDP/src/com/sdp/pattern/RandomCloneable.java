package com.sdp.pattern;

import java.io.Serializable;

public class RandomCloneable implements Cloneable, Serializable {
	private static RandomCloneable instance;

	private RandomCloneable() {
		System.out.println("RandomCloneable()");
	}

	public static RandomCloneable getInstance() {
		if (instance == null) {
			synchronized (RandomCloneable.class) {
				if (instance == null) {
					instance = new RandomCloneable();
				}
			}
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
