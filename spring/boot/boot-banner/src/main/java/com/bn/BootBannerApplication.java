package com.bn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class BootBannerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BootBannerApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(BootBannerApplication.class);
		// builder.bannerMode(Mode.OFF);
		//builder.banner(new ResourceBanner(new ClassPathResource("banner1.txt")));
		
		SpringApplication springApplication = builder.build();
		springApplication.run(args);
	}

}
