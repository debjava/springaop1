package com.ddlab.rnd.type3;

import java.lang.reflect.Method;

public class BeforeHandlerImpl extends BeforeHandler {

	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		
		System.out.println("Handling before actual method execution ........");
	}

}
