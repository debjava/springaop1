package com.ddlab.rnd.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAspect {
	
	@AfterThrowing( pointcut = "execution(* com.ddlab.rnd.aop.AccountImpl.applyTax(..))", throwing= "error")
	public void doAfterThrowing() {
		
		System.out.println("I am doing something after the method throws exception");
	}

}
