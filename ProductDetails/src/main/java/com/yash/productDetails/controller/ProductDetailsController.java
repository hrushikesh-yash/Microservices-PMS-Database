package com.yash.productDetails.controller;


import com.sun.net.httpserver.HttpServer;
import com.yash.productDetails.model.ProductDetails;
import com.yash.productDetails.serviceImpl.ProductDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ProductDetails")
public class ProductDetailsController {
  
  @Autowired
  ProductDetailsServiceImpl productDetailsService;

  @GetMapping("/GetProductDetails/{productId}")
  public ProductDetails getProductDetails(@PathVariable int productId) {
    
    return productDetailsService.findProductDetailsByProductId(productId);
    
    
  }
}
