package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class ProductModel {
		
	
	@id 
	private long id;
	
	@ColumnName
	private String product_name;
	
	
	@ColumnName
	private int price;
	
	@ColumnName
	private int discount;
	
	
}
