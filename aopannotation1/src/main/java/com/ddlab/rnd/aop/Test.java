package com.ddlab.rnd.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml" });
    	Account account = (Account) appContext.getBean("account");
//    	account.openAccount("Deb", "1111", 500);
    	
//    	account.closeAccount("111");
    	
//    	int amount = account.withdrawAmount("111", 5000);
//    	System.out.println(amount);
    	
//    	account.applyLoan("111", 12345);
    	
    	try {
			account.applyTax("111", null);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
