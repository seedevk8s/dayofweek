package com.earth.dayofweek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DayofweekApplication {

	public static void main(String[] args) {
		SpringApplication.run(DayofweekApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, It's Friday!";
	}
}
