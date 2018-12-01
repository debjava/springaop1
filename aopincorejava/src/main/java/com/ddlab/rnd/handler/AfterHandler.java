package com.ddlab.rnd.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AfterHandler implements InvocationHandler {
	
private Object targetObject;
    
    public AfterHandler(Object targetObject) {
        this.targetObject = targetObject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
        int param1 = (Integer)params[0];
        int param2 = (Integer)params[1];
        
        Object result = method.invoke(targetObject ,params);
        System.out.println("I working after......."+targetObject);
        return result;
    }

}
