package com.ddlab.rnd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("around") // If you comment out, it will not work
@Aspect
public class AOPBean {
	
	@Around("execution(* com.ddlab.rnd.aop.CorporateCustomer.getType(..))")
	public Object interceptMethod(ProceedingJoinPoint pjp ) {
		Object obj = null;
		System.out.println("Method Signature ::: "+pjp.getSignature());
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	@Before("execution(* com.ddlab.rnd.aop.RetailCustomer.setName(..))")
	public void hookMethod( JoinPoint jp ) {
		System.out.println("Method Signature Before ::: "+jp.getSignature());
	}

}
