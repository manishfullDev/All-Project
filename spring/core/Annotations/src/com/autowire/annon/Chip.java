package com.autowire.annon;

public class Chip {
	private int id;
	private String chipType;

	public void setId(int id) {
		this.id = id;
	}

	public void setChipType(String chipType) {
		this.chipType = chipType;
	}

	@Override
	public String toString() {
		return "Chip [id=" + id + ", chipType=" + chipType + "]";
	}

}
