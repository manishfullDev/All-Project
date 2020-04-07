package com.boot.swiggy.mobile.endpoints;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot.swiggy.mobile.dto.Restaurant;

@FeignClient(name = "RestaurantServiceFeign", url = "http://localhost:8081/")

public interface RestaurantServiceEndpoint {
	
	@GetMapping(value = "/api/restaurant/{restaurantNo}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	Restaurant getRestaurant(@PathVariable("restaurantNo") int restaurantNo);

}
