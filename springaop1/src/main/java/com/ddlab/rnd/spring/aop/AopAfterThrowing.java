package com.ddlab.rnd.spring.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class AopAfterThrowing implements ThrowsAdvice {

	public String afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		String finalVal = null;
		System.out.println("----------------After Throwing Advice------------------");
		System.out.println("Method name : " + method.getName());
		System.out.println("Method arguments : " + Arrays.toString(args));
		System.out.println("Target object name : " + target);

		return finalVal;
	}

}
