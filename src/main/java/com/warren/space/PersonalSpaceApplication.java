package com.warren.space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PersonalSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalSpaceApplication.class, args);
	}


	@RequestMapping("/hello")
	private  String index(){
		return "hello spring boot";
	}

}