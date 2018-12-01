package com.ddlab.rnd.cglib1;

public class Account {
	
	private int availBalance = 50000;
	
	public int withdraw(String acctNo, int amount) {
		//We will do something here
		return availBalance - amount;
	}

}
