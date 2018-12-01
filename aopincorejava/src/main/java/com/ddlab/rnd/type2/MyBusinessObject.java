package com.ddlab.rnd.type2;

public class MyBusinessObject implements IMyBusinessObject {
	
	@Override
	public String doExecute(String s) {
		System.out.println("Actually.........");
		return "abcd";
	}

}
