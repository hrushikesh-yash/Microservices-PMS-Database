package com.yash.productRatings.serviceImpl;

import com.yash.productRatings.model.ProductRating;
import com.yash.productRatings.repository.ProductRatingRepository;
import com.yash.productRatings.service.ProductRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductRatingServiceImpl implements ProductRatingService {

  @Autowired
  ProductRatingRepository productRatingRepository;
  @Override
  public ProductRating findByProductId (int productId) {
    return productRatingRepository.findByProductId(productId);
  }
}
