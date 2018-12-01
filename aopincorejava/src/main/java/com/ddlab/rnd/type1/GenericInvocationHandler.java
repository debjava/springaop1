package com.ddlab.rnd.type1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GenericInvocationHandler implements java.lang.reflect.InvocationHandler {
	
   private Object target = null;
   public void setTarget(Object target_) {
      this.target = target_;
   }
   private Object realtarget = null;
   public void setRealTarget(Object realtarget_) {
      this.realtarget = realtarget_;
   }
   IMethodInterceptor methodInterceptor = null;
   public void setMethodInterceptor 
      (IMethodInterceptor methodInterceptor_) {
      this.methodInterceptor = methodInterceptor_;
   }
   public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
      try {
         Object interceptBeforeReturnObject = null;
         if ( methodInterceptor != null ) {
            interceptBeforeReturnObject =
               methodInterceptor.interceptBefore
                 (proxy, method, args, realtarget );
         }
         Object retObject = method.invoke(target, args);
         if ( methodInterceptor != null ) {
            methodInterceptor.interceptAfter
               (proxy, method, args, realtarget,
               retObject, interceptBeforeReturnObject );
         }
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