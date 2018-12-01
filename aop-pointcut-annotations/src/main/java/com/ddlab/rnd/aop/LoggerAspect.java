package com.ddlab.rnd.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {
	
	//Hook all the public methods
	@Pointcut("execution(* *(..))")
	public void allMethodsPointcuts(){
	}
	
	@Pointcut("@within(com.ddlab.rnd.aop.AuditLogger)")
//	@Pointcut("@target(com.ddlab.rnd.aop.AuditLogger)")//It is also ok.
	public void allAnnotatedClasses() {
	}
	
	//~~ Actual Implementation
	
	@Around("allAnnotatedClasses()")
	public Object logAnnotatedClasses( ProceedingJoinPoint pjp ) {
		System.out.println("_________________________________________");
		Object result = null;
		System.out.println("Target Object :::"+pjp.getTarget());
		System.out.println("Signature :::"+pjp.getSignature());
		
		for(Object obj : pjp.getArgs() )
			System.out.println("Parameter Values : "+obj);
		
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("_________________________________________");
		return result;
	}
	
	@Around("allMethodsPointcuts()")
	public Object logMethods( ProceedingJoinPoint pjp ) {
		System.out.println("_________________________________________");
		Object result = null;
		System.out.println("Target Object :::"+pjp.getTarget());
		System.out.println("Signature :::"+pjp.getSignature());
		
		for(Object obj : pjp.getArgs() )
			System.out.println("Parameter Values : "+obj);
		
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("_________________________________________");
		return result;
	}

}
