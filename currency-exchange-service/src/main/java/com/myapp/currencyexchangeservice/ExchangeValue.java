package com.myapp.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private Long id;
	private String from ;
	private String to;
	private BigDecimal converionMultiple;
	
	
	
	public ExchangeValue() {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.converionMultiple = converionMultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	

}
