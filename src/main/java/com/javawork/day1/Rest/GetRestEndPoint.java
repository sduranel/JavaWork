package com.javawork.day1.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GetRestEndPoint {

	public static void main(String[] args) {
		SpringApplication.run(GetRestEndPoint.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
    	return "Hello World!";
	}

}
