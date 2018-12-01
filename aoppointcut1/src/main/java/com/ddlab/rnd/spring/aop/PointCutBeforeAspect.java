package com.ddlab.rnd.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutBeforeAspect {
	
//	@Pointcut("execution(* AccountImpl.*(..))")  
	@Pointcut("execution(* com.ddlab.rnd.spring.aop.AccountImpl.doItBefore(..))") 
    public void doItBefore(){}//pointcut name  
	
	@Before("doItBefore()")//applying pointcut on before advice  
    public void doBefore(JoinPoint jp)//it is advice (before advice)  
    {
        System.out.println("***************doItBefore**************");  
        System.out.println("--------------- Let me play with the internals of the methods ---------");
		Object[] objects = jp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		Object targetObject = jp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
    }

}
