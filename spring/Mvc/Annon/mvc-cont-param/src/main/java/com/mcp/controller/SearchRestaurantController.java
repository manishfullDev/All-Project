package com.mcp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mcp.dto.RestaurantDto;

@Controller
public class SearchRestaurantController {
	@RequestMapping("/getRestaurantsByLocation.htm")
	public String getRestaurantsByLocation(@RequestParam("location") String location, Model model) {
		List<RestaurantDto> restaurantDtos = null;

		restaurantDtos = new ArrayList<>();
		restaurantDtos.add(new RestaurantDto(1, "Kruthunga", "93849484", "orders@kruthunga.com"));
		restaurantDtos.add(new RestaurantDto(2, "Ohris", "9373948", "reach@ohris.com"));
		restaurantDtos.add(new RestaurantDto(3, "Minerva", "7384745", "contactus@minerva.com"));
		restaurantDtos.add(new RestaurantDto(4, "Taj", "873948", "locate@taj.com"));
		restaurantDtos.add(new RestaurantDto(5, "Bawarchi", "872934850", "contact@bawarchi.com"));
		restaurantDtos.add(new RestaurantDto(6, "Barbeque Nation", "6384958", "in@barbeque.com"));

		model.addAttribute("restaurants", restaurantDtos);

		return "restaurants";
	}

}
