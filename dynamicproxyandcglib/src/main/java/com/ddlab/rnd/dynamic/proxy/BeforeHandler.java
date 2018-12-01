package com.ddlab.rnd.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BeforeHandler implements InvocationHandler {

    private Object targetObject;
    
    public BeforeHandler(Object targetObject) {
        this.targetObject = targetObject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
        int param1 = (Integer)params[0];
        int param2 = (Integer)params[1];
        if( param2 == 0 ) {
            //Set the default to 1
            param2 = 1;
            params[1] = param2;
        }
        Object result = method.invoke(targetObject ,params);
        return result;
    }

}
