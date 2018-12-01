package com.ddlab.rnd.type2;

public class MyBusinessObject implements IMyBusinessObject {
	
	private static int counter = 0;
	
	@Override
	public String doExecute(String s) {
		System.out.println("*********************************"+(counter++));
		return "abcd";
	}

}
