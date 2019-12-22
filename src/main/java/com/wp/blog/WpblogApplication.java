package com.wp.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.wp.blog.domain"})
public class WpblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpblogApplication.class, args);
	}

}
