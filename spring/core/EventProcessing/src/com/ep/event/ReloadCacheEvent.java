package com.ep.event;

import org.springframework.context.ApplicationEvent;

public class ReloadCacheEvent extends ApplicationEvent {
	private String tableName;

	public ReloadCacheEvent(Object source) {
		super(source);
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
