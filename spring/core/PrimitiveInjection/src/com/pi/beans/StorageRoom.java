package com.pi.beans;

public class StorageRoom {
	private int height;
	private int width;
	private int length;
	private double capacity;
	private String storageType;

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	@Override
	public String toString() {
		return "StorageRoom [height=" + height + ", width=" + width + ", length=" + length + ", capacity=" + capacity
				+ ", storageType=" + storageType + "]";
	}

}
