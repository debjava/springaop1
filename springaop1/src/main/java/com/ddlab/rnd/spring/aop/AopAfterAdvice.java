package com.ddlab.rnd.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AopAfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] methodArguments,
			Object targetObject) throws Throwable {
		System.out.println("----------------After Advice-----------------");
		
		System.out.println("returnValue-------->"+returnValue);
		System.out.println("Target Object ----->"+targetObject);
		System.out.println("Method Name :::"+method.getName());
		System.out.println("--------Method Arguments--------------");
		for( Object object : methodArguments) {
			System.out.println("---->"+object);
		}
		
	}

}
