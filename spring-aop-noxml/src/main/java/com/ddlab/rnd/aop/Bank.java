package com.ddlab.rnd.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bank")
public class Bank {
	
	@Autowired @Qualifier("corporate")
	private ICustomer customer;
	
	public void displayCustomerDetails() {
		
		System.out.println("Customer Type ::: "+customer.getType());
		
	}

}
