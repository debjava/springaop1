package com.ddlab.rnd.spring.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AopAroundAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("----------------Around Advice------------------");
		System.out.println("Method name : " + methodInvocation.getMethod().getName());
		System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
		Object returnResult = methodInvocation.proceed();
		System.out.println("Return result :::"+returnResult);
		return returnResult;
	}

}
