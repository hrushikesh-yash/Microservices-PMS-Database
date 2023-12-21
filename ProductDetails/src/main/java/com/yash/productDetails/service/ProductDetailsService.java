package com.yash.productDetails.service;


import com.yash.productDetails.model.ProductDetails;

public interface ProductDetailsService {

  ProductDetails findProductDetailsByProductId(int productId);
}
