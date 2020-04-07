package com.delicious.bo;

import java.util.List;

public class RestaurantOffersBo {
	protected RestaurantBo restaurant;
	protected List<OfferBo> offers;

	public RestaurantOffersBo(RestaurantBo restaurant, List<OfferBo> offers) {
		super();
		this.restaurant = restaurant;
		this.offers = offers;
	}

	public RestaurantBo getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantBo restaurant) {
		this.restaurant = restaurant;
	}

	public List<OfferBo> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferBo> offers) {
		this.offers = offers;
	}

}
