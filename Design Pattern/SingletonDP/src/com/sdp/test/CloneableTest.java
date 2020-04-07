package com.sdp.test;

import com.sdp.pattern.RandomCloneable;

public class CloneableTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		RandomCloneable randomCloneable = RandomCloneable.getInstance();
		RandomCloneable randomCloneable2 = (RandomCloneable) randomCloneable.clone();
		System.out.println(randomCloneable.hashCode() + " : " + randomCloneable2.hashCode());
	}
}
