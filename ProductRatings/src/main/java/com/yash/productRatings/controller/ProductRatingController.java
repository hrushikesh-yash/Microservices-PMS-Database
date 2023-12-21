package com.yash.productRatings.controller;

import com.yash.productRatings.model.ProductRating;
import com.yash.productRatings.serviceImpl.ProductRatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product-Ratings")
public class ProductRatingController {
	
	@Autowired
	ProductRatingServiceImpl productRatingService;
	@GetMapping("/ByProductId/{productId}")
	 public ProductRating getProductRatingsByProductId(@PathVariable int productId){
		return productRatingService.findByProductId (productId);
	}
}
