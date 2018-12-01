package com.ddlab.rnd.type1;

import java.lang.reflect.Method;

public class After1 extends AbstractBeforeHandler {

	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		
		System.out.println("After handling ............");
	}


}
