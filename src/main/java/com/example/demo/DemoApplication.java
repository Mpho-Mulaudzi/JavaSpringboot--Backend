package com.example.demo;

import com.javaguides.springboot.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class DemoApplication {
	@GetMapping("api/v1/Hello")
	public static String Welcome() {
		String welcomeMsg = "Hello World";
		return welcomeMsg;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
