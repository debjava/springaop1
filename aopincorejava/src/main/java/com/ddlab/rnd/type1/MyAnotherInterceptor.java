package com.ddlab.rnd.type1;

import java.lang.reflect.Method;

public class MyAnotherInterceptor implements IMethodInterceptor {
	
   public Object interceptBefore(Object proxy, Method method, 
      Object[] args, Object realtarget) {
      System.out.println("MyAnotherInterceptor: Going to execute method : ");
      if ( method.getName().equals("doExecute") && 
         args != null && args.length >= 1 ) {
         if ( args[0] instanceof String ) {
            args[0] = args[0] + 
               " Modified by MyAnotherInterceptor";
         }
       return null;
      }
      return null;
   }
   
   public void interceptAfter(Object proxy, Method method, Object[] args, 
      Object realtarget, Object retObject, Object interceptBefore) {
      System.out.println("MyAnotherInterceptor: After execute method : ");
   }
}