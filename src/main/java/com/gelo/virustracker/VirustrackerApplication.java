package com.gelo.virustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VirustrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirustrackerApplication.class, args);
	}

}
