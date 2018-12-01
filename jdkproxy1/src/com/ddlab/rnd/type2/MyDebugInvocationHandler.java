package com.ddlab.rnd.type2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDebugInvocationHandler extends AMyInvocationHandler {
   public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
      try {
//    	  System.out.println("----------------AFTER------------------"); 
         /*System.out.println("MyDebugInterceptor: Before execute method : " 
            + method.getName());   */
         Object retObject = method.invoke(target, args);
         System.out.println("retObject---->"+retObject);
         /*System.out.println("MyDebugInterceptor: After execute method : " 
            + method.getName());*/
         System.out.println("----------------AFTER------------------"); 
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