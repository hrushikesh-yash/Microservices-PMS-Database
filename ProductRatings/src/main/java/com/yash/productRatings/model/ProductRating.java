package com.yash.productRatings.model;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_RATINGS")
public class ProductRating {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ProductRationId")
  private int productRatingId;

  @Column(name = "ProductId")
  private int productId;

  @Column(name = "ProductRating")
  private double productRating;

  @Column(name = "ProductFeedback")
  private String productFeedback;
}
