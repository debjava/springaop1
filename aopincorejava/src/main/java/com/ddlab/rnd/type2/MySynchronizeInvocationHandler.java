package com.ddlab.rnd.type2;

import java.lang.reflect.Method;

public class MySynchronizeInvocationHandler extends AMyInvocationHandler {
   public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
      
      Object retObject = null;
      synchronized(realtarget) {
         retObject = method.invoke(target, args);
      }
      return retObject;
   }
}