package com.ddlab.rnd.cglib1;

import net.sf.cglib.proxy.Enhancer;

import com.ddlab.rnd.cglib.MyInterceptor;

public class Test {
	
	public static <T> T createProxy(T obj) {
        Enhancer e = new Enhancer();

        e.setSuperclass(obj.getClass());
        e.setCallback(new MyInterceptor(obj));
        
        T proxifiedObj = (T) e.create();
        
        return proxifiedObj;
    }

	public static void main(String[] args) {
		Account acct = new Account();
		Account  proxifiedAccount = createProxy(acct);
		int amount = proxifiedAccount.withdraw("123456", 1234);
		System.out.println("Amount drawn :::"+amount);
	}

}
