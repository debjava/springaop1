//package com.ddlab.rnd.spring.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//
//@Aspect
//public class BeforeAOPBean {
//	
////	@Before("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
////	@AfterReturning("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
////	@After("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
////	@AfterThrowing("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
////	@AfterThrowing(pointcut="execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))", throwing="error")
//	
////	@AfterThrowing("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
//	
////	@AfterThrowing(pointcut="execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))", throwing="ex")
////	@AfterThrowing("execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))")
//	
//	
//	
//	
//	
//	
//	@AfterReturning(pointcut="execution(* com.ddlab.rnd.spring.aop.TargetBean.achiveTarget(..))" , returning="result")
//	public void beforeAchieve( JoinPoint joinPoint , Object result ) {
//		System.out.println("Result ---->"+result);
//		System.out.println("________________________________________________________");
//		System.out.println("...Intercepting before achieveTarget method...");
//		System.out.println("Before AOP applied to target object : "+joinPoint.getTarget());
//		System.out.println("Method Name : "+joinPoint.getSignature().getName());
//		
//		Object[] methodParams = joinPoint.getArgs();
//		for( Object obj : methodParams ) {
//			System.out.println(obj);
//		}
//		System.out.println("________________________________________________________");
//		
//	}
//
//}
