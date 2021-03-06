package com.myapp.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	
	@GetMapping("/currency-exchange/from{from}/to{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, 
												@PathVariable String to) {
		return new ExchangeValue();
	}

}
