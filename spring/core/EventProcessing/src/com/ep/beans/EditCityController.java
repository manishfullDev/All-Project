package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.ep.event.ReloadCacheEvent;

public class EditCityController implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	public void updateCity(int cityId, String cityName) {
		ReloadCacheEvent event = null;

		System.out.println("updating city in the database");
		event = new ReloadCacheEvent(this);
		event.setTableName("cities");
		applicationEventPublisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

}
