package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.dto.ProductInventory;
import com.kodewish.service.ProductService;

@RestController
@RequestMapping("/flipkart")
public class ProductController {
	
	
	@Autowired
	ProductService service;
	@PostMapping("/order")
	public ResponseEntity createPost(@RequestBody ProductInventory product) {
		return service.createOrder(product);
	}

}
