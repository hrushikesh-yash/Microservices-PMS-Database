package com.yash.productCategory.service;


import com.yash.productCategory.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
	
	List<ProductCategory> getAllProductCategories();
	
	ProductCategory addProduct (ProductCategory product);
	
	ProductCategory findByProductId(int productId);
}
