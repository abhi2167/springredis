package com.springboot.redis.springredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringredisApplication.class, args);
		System.out.println("===========================> Spring Redis App Started =====================>");
	}
}
