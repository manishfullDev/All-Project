package com.autowire.annon;

public class Ram {
	private int capacity;
	private int speed;

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Ram [capacity=" + capacity + ", speed=" + speed + "]";
	}

}
