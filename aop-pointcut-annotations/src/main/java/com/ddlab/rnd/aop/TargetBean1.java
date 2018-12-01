package com.ddlab.rnd.aop;

public class TargetBean1 {
	
	public String achieveTarget( String s1 , String s2 , String s3) {
		
		return getValue();
	}
	
	private String getValue() {
		return "successfull";
	}

}
