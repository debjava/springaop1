package com.ddlab.rnd.type2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnotherInvocationHandler extends AMyInvocationHandler {
   public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
      try {
//         System.out.println("MyAnotherInvocationHandler: Before execute method : " 
//            + method.getName());         
    	 System.out.println("----------------BEFORE------------------"); 
         if ( method.getName().equals("doExecute") 
            && args != null && args.length >= 1 ) {
            if ( args[0] instanceof String ) {
               args[0] = args[0] + " Modified by MyAnotherInvocationHandler";
            }
         }
         Object retObject = method.invoke(target, args);
         System.out.println("retObject---->"+retObject);
//         System.out.println("----------------BEFORE------------------"); 
//         System.out.println("MyAnotherInvocationHandler: After execute method : " 
//            + method.getName());
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