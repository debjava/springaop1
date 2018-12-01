package com.ddlab.rnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect1 {
	
//	@After("execution(public String com.ddlab.rnd.aop.AccountImpl.closeAccount(..))")
	@After("execution(* com.ddlab.rnd.aop.AccountImpl.closeAccount(..))")
	public void doAfter(JoinPoint jp) {
		System.out.println("--------------- Let me play with the internals of the methods ---------");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
	}

}
