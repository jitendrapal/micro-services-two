package com.demo.microservicestwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroServicesTwoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesTwoApplication.class, args);
	}

}
