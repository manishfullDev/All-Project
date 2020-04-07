package com.sdp.test;

import com.sdp.thread.Action;

public class MultiThreadedTest {
	public static void main(String[] args) {
		Action action = new Action();
		for (int i = 0; i < 100; i++) {
			new Thread(action).start();
		}
	}
}
