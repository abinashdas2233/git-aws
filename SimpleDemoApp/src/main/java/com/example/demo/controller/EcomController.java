package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom")
public class EcomController {
	
	@GetMapping("/fetch")
	public String fetchData() {
		return "data fetched";
	}

}
