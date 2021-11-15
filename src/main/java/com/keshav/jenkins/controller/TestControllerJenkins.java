package com.keshav.jenkins.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.jenkins.dto.Student;

@RestController
public class TestControllerJenkins {

	@GetMapping("/Welcome/{name}")
	public String printName(@PathVariable("name") String name, @RequestParam("Age") String age)
	{
		
		return "Hello! Welcome "+name+" and your age is: "+age;
		
	}
	
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		
		return student;
	}
}
