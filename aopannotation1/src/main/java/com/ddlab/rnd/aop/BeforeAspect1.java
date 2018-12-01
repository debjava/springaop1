package com.ddlab.rnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect1 {
	
//	@Before("execution(public String com.ddlab.rnd.aop.AccountImpl.openAccount(..))")
	@Before("execution(* com.ddlab.rnd.aop.AccountImpl.openAccount(..))")
	public void doBefore(JoinPoint jp) {
		System.out.println("--------------- Let me play with the internals of the methods ---------");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
	}

}
