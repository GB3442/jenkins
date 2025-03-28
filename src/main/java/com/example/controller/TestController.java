package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("wish/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Good evening "+name;
	}
}
