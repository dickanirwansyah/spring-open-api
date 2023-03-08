package com.app.service.appdepartmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {

	@GetMapping(value = "/hallo/{name}")
	public String getHalloDepartment(@PathVariable("name")String name) {
		return "hallo "+name;
	}
	
}
