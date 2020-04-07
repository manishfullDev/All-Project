package com.boot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.profile.beans.DataSourceManager;

@SpringBootApplication
public class BootProfileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProfileApplication.class, args);
		DataSourceManager dsm = context.getBean("dataSourceManager", DataSourceManager.class);
		System.out.println(dsm);
	}

}
