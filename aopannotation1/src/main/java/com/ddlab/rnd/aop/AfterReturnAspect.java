package com.ddlab.rnd.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturnAspect {
	
	@AfterReturning(pointcut = "execution(* com.ddlab.rnd.aop.AccountImpl.applyLoan(..))", returning= "result")
	public void doAfterReturn() {
		System.out.println("I am doing something afte the actual method returns something");
	}

}
