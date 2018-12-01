package com.ddlab.rnd.type2;
public abstract class AMyInvocationHandler implements IMyInvocationHandler, java.lang.reflect.InvocationHandler {
   protected Object target = null;
   protected Object realtarget = null;
   public void setTarget(Object target_) {
      this.target = target_;
   }
   public void setRealTarget(Object realtarget_) {
      this.realtarget = realtarget_;
   }
}