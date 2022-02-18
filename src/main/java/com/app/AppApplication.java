package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@GetMapping("/master")
	public String master(){
		return "Aplicatie pe azure bajetii mei! Timi Titus aici";
	}

	@GetMapping("/master1")
	public String master1(){
		return "Aplicatie pe azure bajetii mei! Timi Titus aici";
	}

	@GetMapping("/mesaj")
	public String message(){
		return "Aplicatie pe azure bajetii mei! Timi Titus aici";
	}


	@GetMapping("/test")
	public String test(){
		return "test";
	}

	@GetMapping("/test1")
	public String test1(){
		return "test";
	}
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
