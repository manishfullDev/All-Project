package com.delicious.service;

import java.util.ArrayList;
import java.util.List;

import com.delicious.bo.OfferBo;
import com.delicious.bo.RestaurantOffersBo;
import com.delicious.dao.RestaurantDao;
import com.delicious.dto.OfferDto;
import com.delicious.dto.RestaurantOffersDto;

public class RestaurantService {
	private RestaurantDao restaurantDao;

	public List<RestaurantOffersDto> getRestaurantsHasOffers() {
		OfferDto offerDto = null;
		List<OfferDto> offersDtos = null;
		RestaurantOffersDto restaurantOffersDto = null;
		List<RestaurantOffersDto> restaurantOffers = null;
		List<RestaurantOffersBo> restaurantOffersBos = null;

		restaurantOffers = new ArrayList<RestaurantOffersDto>();
		restaurantOffersBos = restaurantDao.getRestaurantsWithOffers();
		for (RestaurantOffersBo bo : restaurantOffersBos) {
			offersDtos = new ArrayList<OfferDto>();
			for (OfferBo obo : bo.getOffers()) {
				offerDto = new OfferDto(obo.getOfferNo(), obo.getOfferCode(), obo.getDescription(),
						obo.getMinimumBillAmount(), obo.getOfferValue(), obo.getOfferValueType());
				offersDtos.add(offerDto);
			}

			restaurantOffersDto = new RestaurantOffersDto(bo.getRestaurant().getRestaurantNo(),
					bo.getRestaurant().getRestaurantName(), bo.getRestaurant().getRestaurantType(),
					bo.getRestaurant().getOpeningHours(), bo.getRestaurant().getClosingHours(),
					bo.getRestaurant().getArea(), offersDtos);
			restaurantOffers.add(restaurantOffersDto);
		}

		return restaurantOffers;
	}

	public void setRestaurantDao(RestaurantDao restaurantDao) {
		this.restaurantDao = restaurantDao;
	}

}
