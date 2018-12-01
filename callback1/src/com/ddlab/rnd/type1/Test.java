package com.ddlab.rnd.type1;

public class Test {

	 public static void main(String[] args) {
	    	
	    	MyForm form = new MyForm();
	    	
	    	
	    	MyClass clz = new MyClass();
	    	clz.addListener(form);
//	    	clz.notifiySomethingHappened();
	    	
	    	form.somethingHappened();
			
		}
}
