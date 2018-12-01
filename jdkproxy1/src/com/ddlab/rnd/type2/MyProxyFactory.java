package com.ddlab.rnd.type2;

import java.lang.reflect.Proxy;

public class MyProxyFactory {

	public static Object getProxyObject( Object inputObject, 
			   Object[] invocationHandlers ) throws Throwable {
			   if ( invocationHandlers != null && invocationHandlers.length > 0  ) {
			      Object inputProxiedObject = inputObject;
			      for ( int i=0; i < invocationHandlers.length; i++ ) {
			         inputProxiedObject = getProxyObject(inputObject, 
			            (AMyInvocationHandler)invocationHandlers[i], 
			               inputProxiedObject);
//			         System.out.println(invocationHandlers[i]);
			      }
			      return inputProxiedObject;
			   }
			   else {
			      return inputObject;
			   }
			}
   
	private static Object getProxyObject(Object inObject, 
			   AMyInvocationHandler myInvocationHandler,
			      Object inProxiedObject) throws Throwable {
			   if ( myInvocationHandler == null ) {
			      return inProxiedObject;
			   }
			   myInvocationHandler.setTarget(inProxiedObject);
//			   myInvocationHandler.setRealTarget(inObject);
			   return Proxy.newProxyInstance
			                  (inObject.getClass().getClassLoader(),
			                  inObject.getClass().getInterfaces(),
			                  myInvocationHandler) ;
			}
	
}