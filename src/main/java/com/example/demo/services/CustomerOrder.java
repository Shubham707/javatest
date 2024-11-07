package com.example.demo.services;

public class CustomerOrder {
	@AutoWire
	private RestTemplete restTemp;
	@autoWire
	ProductRepo OrderRepo;
	@autoWire
	OrderModel OrderModel;
	
	@CercuiteBreaker
	public function restApiCustomer(Contomerid) {
		CercuiteBreakerFasctory cbf=new CercuiteBreakerFasctory();
		String data=cbk.forObject(restTemp.forName("orderApiurl"),String);
		orderRepo.getOrderId(Contomerid);
		
		
	}

}

