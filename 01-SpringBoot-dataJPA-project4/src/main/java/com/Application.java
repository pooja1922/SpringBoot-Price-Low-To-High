package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.service.DBservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("application start");
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		DBservice service=context.getBean(DBservice.class);
		service.check();
		System.out.println("application stop");
	}

}
