package com.yash.productDetails.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table (name = "PRODUCT_DETAILS")
public class ProductDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "ProductId")
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "ProductDesc")
	private String productDesc;
}