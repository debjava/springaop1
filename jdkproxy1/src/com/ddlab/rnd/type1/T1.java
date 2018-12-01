package com.ddlab.rnd.type1;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import com.ddlab.rnd.type2.AMyInvocationHandler;


public class T1 {

	public static Object getProxy(Object targetObject, AbstractBeforeHandler handler) {

		handler.setTargetObject(targetObject);
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
				targetObject.getClass().getInterfaces(),handler) ;
	}

	public static Object getProxy(Object targetObject, List<AbstractBeforeHandler> handlers) {
		Object proxyObject = null;
		if( handlers.size() > 0 ) {
//			System.out.println(handlers.size());
			proxyObject = targetObject;
			for( int i = 0 ; i < handlers.size() ; i++ ) {
				handlers.get(i).setTargetObject(proxyObject);
				proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
						targetObject.getClass().getInterfaces(),(AbstractBeforeHandler)handlers.get(i)) ;
//				handlers.get(i).setTargetObject(proxyObject);
				
			}
			return proxyObject;
		}
		else {
			return targetObject;
		}
	}
	
//	public static Object getProxyObject( Object inputObject, 
//			   List<AbstractBeforeHandler> invocationHandlers ) throws Throwable {
//			   if ( invocationHandlers != null && invocationHandlers.length > 0  ) {
//			      Object inputProxiedObject = inputObject;
//			      for ( int i=0; i < invocationHandlers.length; i++ ) {
//			         inputProxiedObject = getProxyObject(inputObject, 
//			            (AbstractBeforeHandler)invocationHandlers.get(i), 
//			               inputProxiedObject);
////			         System.out.println(invocationHandlers[i]);
//			      }
//			      return inputProxiedObject;
//			   }
//			   else {
//			      return inputObject;
//			   }
//			}
//	private static Object getProxyObject(Object inObject, 
//			AbstractBeforeHandler myInvocationHandler,
//			      Object inProxiedObject) throws Throwable {
//			   if ( myInvocationHandler == null ) {
//			      return inProxiedObject;
//			   }
//			   myInvocationHandler.setTargetObject(targetObject);(inProxiedObject);
////			   myInvocationHandler.setRealTarget(inObject);
//			   return Proxy.newProxyInstance
//			                  (inObject.getClass().getClassLoader(),
//			                  inObject.getClass().getInterfaces(),
//			                  myInvocationHandler) ;
//			}
	
	public static void main(String[] args) {

		CalculatorImpl calcImpl = new CalculatorImpl();
		Before1 before = new Before1();
		After1 after = new After1();
		List<AbstractBeforeHandler> handlers = new ArrayList<AbstractBeforeHandler>();
		handlers.add(before);
		handlers.add(after);
		//		before.setTargetObject(calcImpl);
		//		Calculator proxied = (Calculator) Proxy.newProxyInstance(calcImpl.getClass().getClassLoader(),
		//				 calcImpl.getClass().getInterfaces(),
		//				 before) ;
		//		int result = proxied.calculate(20, 10);
		//      System.out.println("FInal Result :::" + result);


//		Calculator proxied = (Calculator) getProxy(calcImpl, before);
//		proxied = (Calculator) getProxy(calcImpl, before1);
//		int result = proxied.calculate(20, 10);
//		System.out.println("FInal Result :::" + result);
		
		
		Calculator proxied = (Calculator) getProxy(calcImpl, handlers);
//		proxied = (Calculator) getProxy(calcImpl, before1);
		int result = proxied.calculate(20, 10);
		System.out.println("FInal Result :::" + result);


	}

}
