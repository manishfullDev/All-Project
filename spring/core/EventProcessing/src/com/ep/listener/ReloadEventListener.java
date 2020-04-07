package com.ep.listener;

import org.springframework.context.ApplicationListener;

import com.ep.event.ReloadCacheEvent;

public class ReloadEventListener implements ApplicationListener<ReloadCacheEvent> {

	@Override
	public void onApplicationEvent(ReloadCacheEvent event) {
		System.out.println("calling cache to reload the table : " + event.getTableName());
	}

}
