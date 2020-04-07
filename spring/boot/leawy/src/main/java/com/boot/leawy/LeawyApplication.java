package com.boot.leawy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.leawy.beans.ThreadService;

@SpringBootApplication
public class LeawyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LeawyApplication.class, args);
		ThreadService ts = context.getBean("threadService", ThreadService.class);
		ts.createThread("Java 11");
	}

}
