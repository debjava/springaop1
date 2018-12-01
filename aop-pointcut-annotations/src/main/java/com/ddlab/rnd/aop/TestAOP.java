package com.ddlab.rnd.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TargetBean1 bean1 = (TargetBean1) context.getBean("targetBean1");
		
		String result = bean1.achieveTarget("asdf", null, "pqrs");
		System.out.println("Result ::: "+result);
		
		TargetBean2 bean2 = (TargetBean2) context.getBean("targetBean2");
		bean2.executeTarget("Hi");

	}

}
