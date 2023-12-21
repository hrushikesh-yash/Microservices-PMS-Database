package com.yash.productCategory.controller;

import com.yash.productCategory.model.ProductCategory;
import com.yash.productCategory.model.ProductRating;
import com.yash.productCategory.model.ProductResponse;
import com.yash.productCategory.serviceImpl.ProductCategoryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productCategory")
@Slf4j
public class ProductCategoryController {

  @Autowired RestTemplate restTemplate;
  @Autowired ProductCategoryServiceImpl productCategoryService;

  /* @GetMapping("/GetAllProducts")
  public ProductResponse getllProducts() {
    List<ProductCategory> productCategoryList = productCategoryService.getAllProductCategories();
    ProductRating ratings = restTemplate.getForObject ("http://localhost:8082/Product-Ratings//ByProductId/1", ProductRating.class);
    return new ProductResponse ( productCategoryList.get(0),ratings);
  }*/

  @GetMapping("/GetProduct/{productId}")
  public ProductResponse getProduct(@PathVariable int productId) {
    ProductCategory product = productCategoryService.findByProductId(productId);
    ProductRating ratings =
        restTemplate.getForObject(
            "http://localhost:8082/Product-Ratings//ByProductId/1", ProductRating.class);
    return ProductResponse.builder()
        .productId(product.getProductId())
        .productName(product.getProductName())
        .productCategory(product.getProductCategory())
        .productRating(ratings.getProductRating())
        .build();
  }

  @PostMapping("/addProduct")
  public ProductCategory addProduct(@RequestBody ProductCategory product) {
    return productCategoryService.addProduct(product);
  }
}
