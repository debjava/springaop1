package com.ddlab.rnd.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml" });
    	Account account = (Account) appContext.getBean("account");
    	
//    	account.doItBefore("111");
    	
//    	account.doItAfter("111");
    	
    	account.doItAround("111");
    }
}
