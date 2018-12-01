package com.ddlab.rnd.spring.aop;

public class TargetBean {

	public String achiveTarget(String str) {

		System.out.println("String value :::"+str);
		
//		System.out.println("Sub String :::"+str.substring(7,9));
		
		return "successful";
	}

}
