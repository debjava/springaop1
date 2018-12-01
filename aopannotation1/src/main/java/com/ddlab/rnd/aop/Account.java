package com.ddlab.rnd.aop;

public interface Account {
	
	public String openAccount(String name, String ssn, int amount);
	
	public String closeAccount(String ssn);
	
	public int withdrawAmount(String acctNo,int amount);
	
	public String applyLoan(String ssn,int loanAmount);
	
	public void applyTax(String ssn,String panNo) throws Exception ;

}
