package com.ddlab.rnd.spring.aop;

public interface Account {
	
	public String doItBefore(String ssn);
	
	public String doItAfter(String ssn);
	
	public String doItAround(String ssn);
	
	public String doItAfterThrowing(String ssn) throws Exception;

}
