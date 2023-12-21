package com.yash.productRatings.repository;

import com.yash.productRatings.model.ProductRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRatingRepository extends JpaRepository<ProductRating, Integer> {
	ProductRating findByProductId(int productId);
}
