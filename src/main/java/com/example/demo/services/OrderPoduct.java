package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
@CercuiteBreaker
public class OrderPoduct {
	
	@AutoWire
	private RestTemplete restTemp;
	@autoWire
	ProductRepo OrderRepo;
	@autoWire
	OrderModel OrderModel;
	
	@CercuiteBreaker
	public function restApiOrder(id) {
		String fooResourceUrl
		  = "http://localhost:8080/spring-rest/foos";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl + "/{Cuntomerid}", String.class);
		orderRepo.getOrderId(response.id);
	}

}
