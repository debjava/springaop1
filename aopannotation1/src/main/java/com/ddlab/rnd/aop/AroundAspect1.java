package com.ddlab.rnd.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAspect1 {
	
	@Around("execution(* com.ddlab.rnd.aop.AccountImpl.withdrawAmount(..))")
	public Object doAround(ProceedingJoinPoint pjp) {
		System.out.println("--------------- Let me play with the internals of the methods ---------");
		System.out.println("Around before is running!");
		Object returnObj = null;
		Object[] objects = pjp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = pjp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
		try {
			returnObj = pjp.proceed();
			System.out.println("-----Completed-----");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around after is running!");
		return returnObj;
	}

}
