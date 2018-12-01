package com.ddlab.rnd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.ddlab.rnd.handler.AfterHandler;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Test {

    public static Object getProxy(Class interfaceClazz, Object implObj, InvocationHandler handler) {
        return Proxy.newProxyInstance(interfaceClazz.getClassLoader(), 
                implObj.getClass().getInterfaces(), handler);
    }

    public static void main(String[] args) throws Exception {
        CalculatorImpl calcImpl = new CalculatorImpl();
//        Calculator proxied = (Calculator) getProxy (Calculator.class, calcImpl, 
//                new BeforeHandler(calcImpl));
//        int result = proxied.calculate(20, 10);
//        System.out.println("FInal Result :::" + result);
        
        Class clazz = Proxy.getProxyClass(calcImpl.getClass().getClassLoader(), new BeforeHandler(calcImpl).getClass().getInterfaces()[0], new AfterHandler(calcImpl).getClass().getInterfaces()[0]);
        
        Calculator proxied = (Calculator) clazz.newInstance();
        int result = proxied.calculate(20, 10);
      System.out.println("FInal Result :::" + result);
        
        
        
        
        
        
        
        
        
    }
}
