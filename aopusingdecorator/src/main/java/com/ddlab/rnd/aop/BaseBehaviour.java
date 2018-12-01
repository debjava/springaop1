package com.ddlab.rnd.aop;

public class BaseBehaviour extends TargetAbstraction {
	
	@Override
	public String doSomething() {
		
		System.out.println("I am doing something in base behaviour class");
		return "Returning from the base behaviour class";
	}

}
