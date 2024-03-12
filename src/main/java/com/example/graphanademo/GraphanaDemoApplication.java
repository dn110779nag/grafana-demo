package com.example.graphanademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GraphanaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphanaDemoApplication.class, args);
	}

}
