package com.yash.productDetails.repository;

import com.yash.productDetails.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
	
	ProductDetails findByProductId(int productId);
}
