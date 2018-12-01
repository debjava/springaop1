package com.ddlab.rnd.type2;

public class Test {

	public static void main(String[] args) throws Throwable {
		
		MyDebugInvocationHandler dHandler = new MyDebugInvocationHandler();
		MyAnotherInvocationHandler aHandler = new MyAnotherInvocationHandler();
		IMyBusinessObject bo = new MyBusinessObject();
		//Now set any variables to these objects
		//or some of these objects may be singletons
		Object[] invocationHandlers = { dHandler, aHandler };
		
		IMyBusinessObject proxy =  (IMyBusinessObject) MyProxyFactory.getProxyObject(bo , invocationHandlers);
		String ret = proxy.doExecute("Hello World");

	}

}
