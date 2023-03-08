package com.app.service.appemployeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {

	@GetMapping(value = "/hallo")
	public String getHalloEmployee(@RequestParam("name")String name) {
		return "Hallo "+name;
	}
	
}
