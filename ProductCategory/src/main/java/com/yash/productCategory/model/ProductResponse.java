package com.yash.productCategory.model;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
public class ProductResponse {
	private int productId;
	private String productName;
	private String productCategory;
	private Double productRating;
}
