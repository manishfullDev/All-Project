package com.nc;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nc.beans.Robot;

@SpringBootApplication
public class NestedContainersApplication {

	@Bean(autowire = Autowire.BY_TYPE)
	public Robot robot() {
		System.out.println("robot()");
		return new Robot();
	}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder().parent(RootConfig.class)
				.sources(NestedContainersApplication.class).build();
		ApplicationContext context = springApplication.run(args);
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
