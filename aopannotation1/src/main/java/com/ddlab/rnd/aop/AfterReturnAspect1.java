package com.ddlab.rnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturnAspect1 {
	
	@AfterReturning(pointcut = "execution(* com.ddlab.rnd.aop.AccountImpl.applyLoan(..))", returning= "result")
	public void doAfterReturn(JoinPoint jp, Object result) {
		System.out.println("---Let me do something when method returns something---");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
		System.out.println("Final return result :::"+result);
	}

}
