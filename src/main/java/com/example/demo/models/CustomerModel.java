package com.example.demo.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
	
	@id 
	private long id;
	
	
	@ColumnName
	private String customer_name;
	
	
	@ColumnName
	private int Kyc;
	
	
	
}
