package com.okrohan.kentarus.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HealthCheckController {

	@GetMapping("/health")
	public String healthCheck() {
		return String.format("200:AOK!");
	}

}
