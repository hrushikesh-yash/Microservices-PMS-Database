package com.yash.productCategory.model;

import javax.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_CATEGORY")
public class ProductCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ProductId")
  private int productId;

  @Column(name = "ProductCategory")
  private String productCategory;

  @Column(name = "productName")
  private String productName;

  @Column(name = "ProductDesc")
  private String productDesc;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ProductRationId", referencedColumnName = "ProductRationId")
  private ProductRating productRating;
}
