package com.ddlab.rnd.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static Object getProxy(Class interfaceClazz, Object implObj, InvocationHandler handler) {
        return Proxy.newProxyInstance(interfaceClazz.getClassLoader(), 
                implObj.getClass().getInterfaces(), handler);
    }

    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        Calculator proxied = (Calculator) getProxy (Calculator.class, calcImpl, 
                new BeforeHandler(calcImpl));
        int result = proxied.calculate(20, 10);
        System.out.println("FInal Result :::" + result);
    }
}
