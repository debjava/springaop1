package com.ddlab.rnd.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TargetBean target = (TargetBean) context.getBean("targetBean");
//		String result = target.achiveTarget("abcd");
//		System.out.println("Result : "+result);
		
		System.out.println(target.achiveTarget("abcd"));
	}

}
