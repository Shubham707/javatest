package com.example.demo.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

	@id 
	private long id;
	
	@ManyToOne(class::Costomer)
	@ColumnName
	private long productId
	
	@ColumnName
	private String order_name;
	
	
	@ColumnName
	private int price;
	
	@ColumnName
	private DateTime Orderdate;
	
}

