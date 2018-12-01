package com.ddlab.rnd.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect {
	
//	@After("execution(public String com.ddlab.rnd.aop.AccountImpl.closeAccount(..))")
	@After("execution(* com.ddlab.rnd.aop.AccountImpl.closeAccount(..))")
	public void doAfter() {
		System.out.println("I am doing something afte the actual method execution");
	}

}
