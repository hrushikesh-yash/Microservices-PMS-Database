package com.yash.productRatings.service;

import com.yash.productRatings.model.ProductRating;

public interface ProductRatingService {
	
	ProductRating findByProductId(int productId);
}
