package com.ddlab.rnd.aop;


public class Test {

	public static void main(String[] args) {
		BaseBehaviour base = new BaseBehaviour();
		TargetAbstraction target = new Proxy(base);
		System.out.println(target.doSomething());
	}

}
