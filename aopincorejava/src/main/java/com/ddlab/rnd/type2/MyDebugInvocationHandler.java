package com.ddlab.rnd.type2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDebugInvocationHandler extends AMyInvocationHandler {
   public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
      try {
         System.out.println("MyDebugInterceptor: Before execute method : " 
            + method.getName());   
         Object retObject = method.invoke(target, args);
         System.out.println("MyDebugInterceptor: After execute method : " 
            + method.getName());
         return retObject;
      }
      catch(InvocationTargetException e) {
         throw e.getTargetException();
      }
      catch(Exception e) {
         throw e;
      }
   }
}