package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
@CercuiteBreaker
public class ProductService {
	
	@AutoWire
	private RestTemplete restTemp;
	@autoWire
	ProductRepo prodctRepo;
	@autoWire
	ProductModel prodctModel;
	
	
	@CercuiteBreaker
	public function restApiProduct() {
		ResponseEntity<String> data
		  = restTemplate.getForEntity(fooResourceUrl + "/{Cuntomerid}", String.class);
		prodctRepo.getProductAll(data);
	}
	
	
	
	@CercuiteBreaker
	public function restApiProduct(id) {
		ResponseEntity<String> data
		  = restTemplate.getForEntity(fooResourceUrl + "/{Cuntomerid}", String.class);
		prodctRepo.getProductId(data.id);
	}

	
	
	
	
	
	
}
