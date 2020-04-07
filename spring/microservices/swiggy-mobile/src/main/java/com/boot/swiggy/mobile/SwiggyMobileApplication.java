package com.boot.swiggy.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.boot.swiggy.mobile.dto.Restaurant;
import com.boot.swiggy.mobile.service.RestaurantMobileService;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
public class SwiggyMobileApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SwiggyMobileApplication.class, args);
		RestaurantMobileService restaurantMobileService = context.getBean("restaurantMobileService",
				RestaurantMobileService.class);
		Restaurant restaurant = restaurantMobileService.getRestaurant(1);
		System.out.println(restaurant);
	}

}
