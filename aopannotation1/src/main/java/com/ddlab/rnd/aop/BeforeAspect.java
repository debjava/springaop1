package com.ddlab.rnd.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	
//	@Before("execution(public String com.ddlab.rnd.aop.AccountImpl.openAccount(..))")
	@Before("execution(* com.ddlab.rnd.aop.AccountImpl.openAccount(..))")
	public void doBefore() {
		System.out.println("I am doing something before the actual method gets executed");
	}

}
