package com.ddlab.rnd.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestNoXMLAOP {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringNoXmlConfig.class);
		Bank bank = (Bank) context.getBean("bank");
		bank.displayCustomerDetails();
		
		ICustomer customer = (ICustomer) context.getBean("retail");
		customer.setName("Deb");
		
	}

}
