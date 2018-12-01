package com.ddlab.rnd.type1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class AbstractBeforeHandler implements InvocationHandler {
	
	private Object targetObject;
	
	public abstract void handleBefore(Object proxy, Method method, Object[] args);
	
	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		handleBefore(proxy, method, args);
		
		return method.invoke(targetObject, args);
		
	}

}
