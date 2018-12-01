package com.ddlab.rnd.aop;

import org.springframework.stereotype.Component;

@Component(value="retail")
public class RetailCustomer implements ICustomer {

	private String name = null;
	
	@Override
	public String getType() {
		return "Retail";
	}

	@Override
	public void setName(String name) {
		this.name = name;
		System.out.println("Customer Name --->"+name);
	}
}
