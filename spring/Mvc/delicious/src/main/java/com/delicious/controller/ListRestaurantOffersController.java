package com.delicious.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.delicious.dto.RestaurantOffersDto;
import com.delicious.service.RestaurantService;

public class ListRestaurantOffersController extends AbstractController {
	private RestaurantService restaurantService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = null;
		List<RestaurantOffersDto> restaurantOffersDtos = null;

		restaurantOffersDtos = restaurantService.getRestaurantsHasOffers();
		modelAndView = new ModelAndView();
		modelAndView.setViewName("restaurant-offers");
		modelAndView.addObject("restaurantOffers", restaurantOffersDtos);

		return modelAndView;
	}

	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}

}
