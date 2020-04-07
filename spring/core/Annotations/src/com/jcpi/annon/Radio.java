package com.jcpi.annon;

// no source code
public class Radio {
	private int stationNo;
	private int volumeLevel;
	private int frequency;

	public void init() {
		if (stationNo == 39) {
			frequency = 4020;
		}
	}

	public void shutdown() {
		System.out.println("cleaning...");
	}

	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	@Override
	public String toString() {
		return "Radio [stationNo=" + stationNo + ", volumeLevel=" + volumeLevel + ", frequency=" + frequency + "]";
	}

}
