package com.jenkins.docker.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class HomeController {

	@GetMapping(path = "/home")
	public String homePage() {
		return "Home Page";
	}
	@GetMapping(path = "/contact")
	public String contactPage() {
		return "Contact Page";
	}
	@GetMapping(path = "/about")
	public String aboutPage() {
		return "About Page";
	}
}
