package com.spring.b.d;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBDocApplication {
	@GetMapping("/text")
	
	public String Gettext() {
		return "heyy this is test";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBDocApplication.class, args);
	}

}
