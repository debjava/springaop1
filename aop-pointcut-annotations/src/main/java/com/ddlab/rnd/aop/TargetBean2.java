package com.ddlab.rnd.aop;

@AuditLogger
public class TargetBean2 {
	
	public String executeTarget( String s1 ) {
		
		return "some value";
	}
}
