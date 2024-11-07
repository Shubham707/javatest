package com.example.demo;

import org.hibernate.SessionFactory;

@RestControler
@RequestMapping('order');

public class OrderCustomer {
	@AutoWire
	private OrdeService orderService;
	
	@GetMapping("order/{id}")
	public String OrderAll(@PathVariale int id) {
		
		return orderService.restApiOrder(id);
	}
	
	
	@GetMapping("order")
	public List<CustomerOrder> OrderAll(OrderModel order)) {
		
		return orderService.restApiOrder(order);
	}
	
	
	public String createOder(oderid) {
		
		SessionFactory sf=new SessionFactory();
		StringBuilder sb=StringBuilder();
		sf.getCache(sb.append(oderid));
		
	}
	
	public List<Cart> getAllProduct(Customerid){
		
		return cartServiceData(Customerid);
	}
		
		
				
				
	

}
