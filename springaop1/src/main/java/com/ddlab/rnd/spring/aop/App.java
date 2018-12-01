package com.ddlab.rnd.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml" });
    	Employee emp = (Employee) appContext.getBean("employeeProxy");
    	emp.invoke("John", 40, "Software Engineer");
    	String result = emp.returnSomeValue("abcd");
    	emp.setName("John");
    	System.out.println("Result :::"+result);
    	System.out.println("Emp Name :::"+emp.getName());
    	System.out.println("Emp Salary :::"+emp.getSalary());
    	
    	try {
			String s = emp.getSomeValue(null);
			System.out.println("Final Some Value :::"+s);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
