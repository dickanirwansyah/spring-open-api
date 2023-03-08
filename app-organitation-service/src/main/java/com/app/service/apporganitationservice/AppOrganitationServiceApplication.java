package com.app.service.apporganitationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@OpenAPIDefinition(
		servers = {@Server(url = "/organitation", description = "Default Server Path URL")},
		info = @Info(
		title = "Organitation API",
		version = "1.0",
		description = "Documentation Organitation API v1.0"
		))
public class AppOrganitationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOrganitationServiceApplication.class, args);
	}

}
