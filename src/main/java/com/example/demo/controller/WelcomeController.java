package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String welMeth(){
		return "successfully deployed first sb application in azure"; 
	}

}
