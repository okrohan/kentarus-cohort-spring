package com.okrohan.kentarus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KentarusApplication {

	public static void main(String[] args) {
		SpringApplication.run(KentarusApplication.class, args);
	}

}
