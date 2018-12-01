package com.ddlab.rnd.type1;

import java.lang.reflect.Method;

public interface IMethodInterceptor {
   Object interceptBefore(Object proxy, Method method, 
      Object[] args, Object realtarget);
   void interceptAfter(Object proxy, Method method, 
      Object[] args, Object realtarget, Object retObject, 
      Object interceptBeforeReturnObject);
}