package com.ddlab.rnd.cglib1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyAccountInterceptor implements MethodInterceptor {

	private Object realObj;

	public MyAccountInterceptor(Object obj) 
	{
		this.realObj = obj;
	}
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable 
	{
		System.out.println("Before"); 
		Object res = method.invoke(realObj, objects);
		System.out.println("After");
		return res;
	}



}
