package com.ddlab.rnd.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAroundAspect {
	
	@Pointcut("execution(* com.ddlab.rnd.spring.aop.AccountImpl.doItAround(..))") 
    public void doItAround(){}//pointcut name  
	
	@Around("doItAround()")//applying pointcut 
    public void doAround(ProceedingJoinPoint pjp)//it is advice (before advice)  
    {
        System.out.println("***************doItAround**************");  
        System.out.println("--------------- Let me play with the internals of the methods ---------");
		Object[] objects = pjp.getArgs();
		for( Object obj : objects ) {
			System.out.println("Methd Parameter Values ::: "+obj);
		}
		try {
			Object result = pjp.proceed();
			System.out.println("Final result :::"+result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		Object targetObject = pjp.getTarget();
		System.out.println("Target Object Name :::"+targetObject);
    }
}
