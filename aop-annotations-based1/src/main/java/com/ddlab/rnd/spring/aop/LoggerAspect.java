package com.ddlab.rnd.spring.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {
	
	@Pointcut("within(@org.springframework.stereotype.Controller *)")
	public void allBean() {
	}
	
	
	@Pointcut("execution(* *(..))")
	public void methodPointcut() {
	}
	
	@Around("methodPointcut()")
	public Object aroundRepositoryMethod(ProceedingJoinPoint joinPoint)
			throws Throwable {
		System.out.println(">>>>>>>> invoking {}"+joinPoint.getSignature());
		Object result = joinPoint.proceed();
		
//		log.debug(">>>>>>>> invoking {}", joinPoint.getSignature());
//		Date start = new Date();
//		
//		Date end = new Date();
//		log.debug(">>>>>>>> return of {} with {}", joinPoint.getSignature(),
//				BeanUtils.describe(result));
//		log.debug(">>>>>>>> end of {} take {} millisec",
//				joinPoint.getSignature(), end.getTime() - start.getTime());
		return result;
	}

}
