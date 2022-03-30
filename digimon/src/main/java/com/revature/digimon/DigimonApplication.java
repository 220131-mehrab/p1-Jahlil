package com.revature.digimon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DigimonApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigimonApplication.class, args);
	}

}
