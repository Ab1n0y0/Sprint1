package com.google.UserSevce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.product.entity.Product;

@RestController
public class UseServicecontroller {

	@GetMapping("/product")
	public Product addProduct()
	{
		return new Product ("key",200,"lap");
	}
}
