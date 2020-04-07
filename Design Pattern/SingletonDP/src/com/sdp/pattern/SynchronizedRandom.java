package com.sdp.pattern;

public class SynchronizedRandom {
	private static SynchronizedRandom instance;

	private SynchronizedRandom() {
	}

	public static SynchronizedRandom getInstance() {
		if (instance == null) {
			synchronized (SynchronizedRandom.class) { // class-scope synchronization
				System.out.println("lock()");
				if (instance == null) {
					instance = new SynchronizedRandom();
				}
				System.out.println("unlock()");
			}
		}
		return instance;
	}

}
