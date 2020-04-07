package org.sparkframework.web.metadata;

import java.util.List;

public class ActionMetadata {
	protected String path;
	protected String type;
	protected List<PageForward> pageForwards;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<PageForward> getPageForwards() {
		return pageForwards;
	}

	public void setPageForwards(List<PageForward> pageForwards) {
		this.pageForwards = pageForwards;
	}

}
