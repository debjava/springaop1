package com.ddlab.rnd.aop;

import org.springframework.stereotype.Component;

@Component(value="corporate")
public class CorporateCustomer implements ICustomer {

	private String name = null;
	
	@Override
	public String getType() {
		return "Corporate";
	}

	@Override
	public void setName(String name) {
		this.name = name;
		System.out.println("Customer Name --->"+name);
	}
}
