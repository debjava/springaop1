package com.ddlab.rnd.spring.aop;

public class Employee {
	
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void invoke(String name,int age,String desgn) {
		System.out.println("Name----->"+name);
		System.out.println("Age :::"+age);
		System.out.println("Designation :::"+desgn);
	}
	
	public String returnSomeValue(String str) {
		return str+" : New Value";
	}
	
	public String getSomeValue(String ss) throws Exception {
		System.out.println("Some Value---->"+ss);
		String temp = ss.substring(2);
		System.out.println("After some value---->"+temp);
		return temp;
	}

}
