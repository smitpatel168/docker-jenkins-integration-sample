package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoJenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoJenkinsIntegrationApplication.class, args);
	}
	
	@GetMapping("/")
	public String testProject() {
		return "Test Project - Jenkins <=> Docker Integration";
	}
	

}
