package com.boot.swiggy.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.boot.swiggy.mobile.dto.Restaurant;
import com.boot.swiggy.mobile.endpoints.RestaurantServiceEndpoint;

@Component
public class RestaurantMobileService {
	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;

	@Autowired
	private RestaurantServiceEndpoint restaurantServiceEndpoint;

	//@HystrixCommand(fallbackMethod = "errorGetRestaurant")
	public Restaurant getRestaurant(int restaurantNo) {
		/*
		 * return restTemplate.getForObject(
		 * "http://SWIGGY-SERVICE/api/restaurant/{restaurantNo}", Restaurant.class,
		 * restaurantNo);
		 */
		return restaurantServiceEndpoint.getRestaurant(restaurantNo);
	}

	private Restaurant errorGetRestaurant(int error) {
		System.out.println(error);
		return new Restaurant();
	}

}
