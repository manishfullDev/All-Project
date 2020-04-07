package com.boot.swiggy.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.swiggy.dto.Restaurant;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantService {

	@GetMapping(value = "/{restaurantNo}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Restaurant getRestaurant(@PathVariable("restaurantNo") int restaurantNo) {
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantNo(restaurantNo);
		restaurant.setRestaurantName("Bawarchi");
		restaurant.setCuisine("Local");
		restaurant.setContactNo("9893839847");
		restaurant.setEmailAddress("contactus@bawarchi.com");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return restaurant;
	}

}
