package com.ddlab.rnd.type1;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
   public static Object getProxyObject( String className, 
      String[] interceptors ) throws Throwable {
      Object inputObject = getTargetObject(className);
      if ( interceptors != null && interceptors.length > 0  ) {
         Object inputProxiedObject = inputObject;
         for ( int i=0; i < interceptors.length; i++ ) {
            inputProxiedObject = 
               getProxyObject(inputObject, interceptors[i], 
                  inputProxiedObject);
         }
         return inputProxiedObject;
      }
      else {
         return inputObject;
      }
   }
   private static Object getProxyObject(Object inObject, 
      String interceptor,Object inProxiedObject) throws Throwable {
      GenericInvocationHandler invocationHandler =
         new GenericInvocationHandler();
      IMethodInterceptor interceptorObject = 
         (IMethodInterceptor)getInterceptor(interceptor);
      if ( interceptor == null ) {
         return inProxiedObject;
      }
      invocationHandler.setTarget(inProxiedObject);
      invocationHandler.setRealTarget(inObject);
      invocationHandler.setMethodInterceptor(interceptorObject);
      return Proxy.newProxyInstance
               (inObject.getClass().getClassLoader(),
               inObject.getClass().getInterfaces(),
               invocationHandler) ;
   }
   
   private static Object getInterceptor( String interceptors ) 
      throws Exception {    
	   
	   return Class.forName(interceptors).newInstance();
      //...
      //From the class name return the class instance.
        //You can use Class.forName and newInstance() method on Class 
        //to return the Object instance.
   }
   private static Object getTargetObject( String className )  
      throws Exception {
	   
	   return Class.forName(className).newInstance();
	   
      //...
      //From the class name return the class instance.
        //You can use Class.forName and newInstance() method on Class 
        //to return the Object instance.
   }
}