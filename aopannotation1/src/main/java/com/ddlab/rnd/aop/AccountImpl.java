package com.ddlab.rnd.aop;

public class AccountImpl implements Account {

	public String openAccount(String name, String ssn, int amount) {
		System.out.println("Going to open a new account for "+name);
		System.out.println("Your SSN : "+ssn);
		
		return "123456";
	}

	public String closeAccount(String ssn) {
		System.out.println("Savings account will be closed for : "+ssn);
		return "account closed successfully";
	}

	public int withdrawAmount(String acctNo, int amount) {
		int availableBalance = 50000;//dummy value
		return amount;
	}

	public String applyLoan(String ssn, int loanAmount) {
		System.out.println("Your SSN : "+ssn);
		System.out.println("Your loan amount : "+loanAmount);
		return "You are eligible for loan";
	}
	
	public void applyTax(String ssn,String panNo) throws Exception {
		
		if(panNo == null) throw new NullPointerException("Pan No is not available ...");
	}

}
