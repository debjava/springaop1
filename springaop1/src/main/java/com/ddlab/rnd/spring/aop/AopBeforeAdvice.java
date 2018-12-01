package com.ddlab.rnd.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AopBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] methodArguments, Object targetObject)
			throws Throwable {
		System.out.println("----------------Before Advice-----------------");
		System.out.println("Method Name :::"+method.getName());
		System.out.println("--------Method Arguments--------------");
		for( Object object : methodArguments) {
			System.out.println("---->"+object);
		}
		System.out.println("Target Obbject Name :::"+targetObject);
	}

}
