package com.ddlab.rnd.spring.aop;

public class AccountImpl implements Account {

	public String doItBefore(String ssn) {
		System.out.println("----BEFORE----");
		return "before : "+ssn;
	}

	public String doItAfter(String ssn) {
		System.out.println("----AFTER----");
		return "after : "+ssn;
	}

	public String doItAround(String ssn) {
		System.out.println("----AROUND----");
		return "around : "+ssn;
	}

	public String doItAfterThrowing(String ssn) throws Exception {
		System.out.println("----AROUND----");
		if( ssn == null ) throw new NullPointerException("SSN is null");
		return "AfterThrowing : "+ssn;
	}

}
