package com.api.path.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.path.model.Product;
import com.api.path.service.ProductServiceImpl;

@RestController
public class HomeController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping(value = "/")
	String defaultLanding() {
		return "Success!!";
	}
	
	@PostMapping(value = "/products")
	Product saveProduct(Product product) {
		Product product2 = new Product(1, "Dell", "Laptop", 15000);
		return productServiceImpl.addProduct(product2);
	}
	
	
	
}
