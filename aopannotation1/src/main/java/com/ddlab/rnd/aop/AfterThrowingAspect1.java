package com.ddlab.rnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAspect1 {
	
	@AfterThrowing( pointcut = "execution(* com.ddlab.rnd.aop.AccountImpl.applyTax(..))", throwing= "error")
	public void doAfterThrowing(JoinPoint jp,Throwable error) {
		System.out.println("---Let me do something when the method throws Exception---");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
		System.out.println("Exception Type :::"+error);
	}

}
