package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@GetMapping("/mesaj")
	public String message(){
		return "Aplicatie pe azure bajetii mei! Timi Titus aici";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
