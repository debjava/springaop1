package com.ddlab.rnd.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAfterAspect {
	
	@Pointcut("execution(* AccountImpl.doItAfter(..))")  
    public void doItAfter(){}//pointcut name  
	
	@After("doItAfter()")//applying pointcut on before advice  
    public void doAfter(JoinPoint jp)//it is advice (before advice)  
    {
		System.out.println("***************doItAfter**************");  
        System.out.println("--------------- Let me play with the internals of the methods ---------");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
    }  
}
