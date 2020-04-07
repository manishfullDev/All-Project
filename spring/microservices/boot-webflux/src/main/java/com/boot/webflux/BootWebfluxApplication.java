package com.boot.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.boot.webflux.entities" })
@EnableJpaRepositories(basePackages = { "com.boot.webflux.repository" })
public class BootWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWebfluxApplication.class, args);
	}

}
