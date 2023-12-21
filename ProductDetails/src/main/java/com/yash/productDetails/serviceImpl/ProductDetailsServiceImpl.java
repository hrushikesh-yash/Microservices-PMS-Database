package com.yash.productDetails.serviceImpl;


import com.yash.productDetails.model.ProductDetails;
import com.yash.productDetails.repository.ProductDetailsRepository;
import com.yash.productDetails.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

  @Autowired
  ProductDetailsRepository productDetailsRepository;
  
  @Override
  public ProductDetails findProductDetailsByProductId(int productId)
  {
    return productDetailsRepository.findByProductId (productId);
  }
}
