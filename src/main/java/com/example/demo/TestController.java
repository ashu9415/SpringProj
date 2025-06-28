package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/v1/Test")
	public String getMessage() {
		return "Hello World !!";
	}
	
}
