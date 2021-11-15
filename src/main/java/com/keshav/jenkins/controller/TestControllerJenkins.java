package com.keshav.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.jenkins.dto.Student;

@RestController
public class TestControllerJenkins {

	@GetMapping("/Welcome/{name}")
	public String printName(@PathVariable("name") String name)
	{
		return "Hello! Welcome "+name;
		
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		
		return student;
	}
}
