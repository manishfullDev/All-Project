package com.sdp.thread;

import com.sdp.pattern.SynchronizedRandom;

public class Action implements Runnable {

	@Override
	public void run() {
		SynchronizedRandom random = null;

		random = SynchronizedRandom.getInstance();
		System.out.println("hashCode : " + random.hashCode());
	}

}
