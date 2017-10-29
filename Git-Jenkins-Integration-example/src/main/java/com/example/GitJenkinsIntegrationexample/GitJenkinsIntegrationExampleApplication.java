package com.example.GitJenkinsIntegrationexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitJenkinsIntegrationExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitJenkinsIntegrationExampleApplication.class, args);
	}
	
	@RequestMapping("/test")
	public String test(){
		return "hollo world.Modified";
	}
}
