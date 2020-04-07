package com.tpct.beans;

public class MapType {
	private String viewType;
	private boolean traffic;

	public String getViewType() {
		return viewType;
	}

	public boolean isTraffic() {
		return traffic;
	}

	public void setViewType(String viewType) {
		this.viewType = viewType;
	}

	public void setTraffic(boolean traffic) {
		this.traffic = traffic;
	}

	@Override
	public String toString() {
		return "MapType [viewType=" + viewType + ", traffic=" + traffic + "]";
	}

}
