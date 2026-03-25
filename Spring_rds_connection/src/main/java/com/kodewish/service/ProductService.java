package com.kodewish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kodewish.dto.ProductInventory;
import com.kodewish.entity.Product;
import com.kodewish.repository.ProductRepo;

@Service
public class ProductService {
	
	
	@Autowired
	ProductRepo repo;
	
	
	public ResponseEntity createOrder(ProductInventory inventory) {
		Product product=new Product();
		product.setProductName(inventory.getProductName());
		product.setPrice(inventory.getPrice());
		product.setQuantity(inventory.getQuantity());
		
		repo.save(product);
		return ResponseEntity.ok("suceess fully data uploaded");
	}
	

}
