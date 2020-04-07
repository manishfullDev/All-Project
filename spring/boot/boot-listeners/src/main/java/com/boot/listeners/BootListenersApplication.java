package com.boot.listeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootListenersApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder(BootListenersApplication.class)
				.listeners(new BootListener()).build();
		ApplicationContext context = springApplication.run(args);
	}

}
