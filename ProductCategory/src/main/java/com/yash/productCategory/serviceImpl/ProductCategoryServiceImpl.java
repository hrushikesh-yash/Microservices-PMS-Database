package com.yash.productCategory.serviceImpl;

import com.yash.productCategory.model.ProductCategory;
import com.yash.productCategory.repository.ProductCategoryRepository;
import com.yash.productCategory.service.ProductCategoryService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

  @Autowired ProductCategoryRepository productCategoryRepository;

  @Override
  public List<ProductCategory> getAllProductCategories() {

    return new ArrayList<>(productCategoryRepository.findAll());
  }

  @Override
  public ProductCategory addProduct(ProductCategory product) {
    return productCategoryRepository.save(product);
  }
  
  @Override
  public ProductCategory findByProductId (int productId) {
    return productCategoryRepository.findById (productId).get ();
  }
}
