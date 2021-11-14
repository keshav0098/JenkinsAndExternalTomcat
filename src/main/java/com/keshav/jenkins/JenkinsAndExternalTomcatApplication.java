package com.keshav.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsAndExternalTomcatApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(JenkinsAndExternalTomcatApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsAndExternalTomcatApplication.class, args);
	}

}
