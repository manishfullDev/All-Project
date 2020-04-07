package com.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class BootWebDeployApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			jdbcTemplate.query("select * from user_role", (rs, rowNum) -> {
				System.out.println(rs.getString(2));
				return null;
			});
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(BootWebDeployApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootWebDeployApplication.class);
	}

}
