package com.ddlab.rnd.type2;

import java.lang.reflect.InvocationHandler;

public abstract class AMyInvocationHandler implements IMyInvocationHandler, InvocationHandler {
	
	protected Object target = null;
//	protected Object realtarget = null;

	public void setTarget(Object target_) {
		this.target = target_;
	}

//	public void setRealTarget(Object realtarget_) {
//		this.realtarget = realtarget_;
//	}
	
}