package com.javelin.mystream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MystreamApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MystreamApplication.class, args);
	}
}
