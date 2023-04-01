package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {

	
	@Autowired
	private ProductService proService;
	
	
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProductHandler(@Valid @RequestBody Product product) throws ProductException{
		
		Product addProd = proService.addProduct(product);
		
		return new ResponseEntity<Product>(addProd, HttpStatus.CREATED);
		
		
		
		
	}
	
	
	
}
	