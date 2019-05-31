package com.yuer.SprintBootTest.yuerSprintBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class YuerSprintBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuerSprintBootTestApplication.class, args);
	}
	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot123";
	}
}
