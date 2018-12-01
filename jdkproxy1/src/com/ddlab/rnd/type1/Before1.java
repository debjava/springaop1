package com.ddlab.rnd.type1;

import java.lang.reflect.Method;

public class Before1 extends AbstractBeforeHandler {

	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
//		setTargetObject(target);
		System.out.println("Before handling ............");
	}

//	@Override
//	public void setTargetObject(Object targetObject) {
//		
//	}

}
