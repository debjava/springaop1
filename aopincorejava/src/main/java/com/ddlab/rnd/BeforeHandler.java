package com.ddlab.rnd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
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
        System.out.println("I working after......."+targetObject);
        return result;
    }

}
