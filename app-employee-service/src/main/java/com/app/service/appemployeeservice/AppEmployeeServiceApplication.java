package com.app.service.appemployeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
		servers = {@Server(url = "/employee", description = "Default Server Path URL")},
		info = @Info(
		title = "Employee API",
		version = "1.0",
		description = "Documentation Employee API v1.0"
		))
public class AppEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEmployeeServiceApplication.class, args);
	}

}
