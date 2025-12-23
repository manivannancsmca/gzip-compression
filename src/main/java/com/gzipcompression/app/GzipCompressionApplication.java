package com.gzipcompression.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GzipCompressionApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world application with Gzip compression!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GzipCompressionApplication.class, args);
	}
}