package com.myapps.orderservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.orderbean.OrderConfiguration;
import com.myapps.orderservice.Order;

@RefreshScope
@RestController
public class OrderController {
	
	@Autowired
	private Order orderConfig;
	
	@GetMapping("/orders")
	public OrderConfiguration retrieveOrderConfiguration() {
		return new OrderConfiguration(orderConfig.getMaximum(),
									  orderConfig.getMinimum());
	}
	
}
