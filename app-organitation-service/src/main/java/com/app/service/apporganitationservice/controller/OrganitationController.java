package com.app.service.apporganitationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/organitation")
public class OrganitationController {

	@GetMapping(value = "/hallo/{name}")
	private String getHalloOrganitation(@PathVariable("name")String name) {
		return "Hallo "+name;
	}
	
}
