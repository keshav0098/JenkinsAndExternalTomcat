package com.keshav.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerJenkins {

	@GetMapping("/Welcome/{name}")
	public String printName(@PathVariable("name") String name)
	{
		return "Hello! Welcome "+name;
		
	}
}
