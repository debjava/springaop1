package com.ddlab.rnd.aop;

public class Proxy extends TargetAbstraction {
	
	private BaseBehaviour myBaseBehavior;
	
    public Proxy(BaseBehaviour aBaseBehavior) {
          myBaseBehavior = aBaseBehavior;
    }

	@Override
	public String doSomething() {
		System.out.println("Before ..............");
		String returnValue = myBaseBehavior.doSomething();
		System.out.println("After ..............");
		return returnValue;
	}
}
