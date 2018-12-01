package com.ddlab.rnd.type1;
public class MyForm implements MyListener {
	MyClass myClass;
	
    public MyForm() {
        myClass = new MyClass();
        myClass.addListener(this);
    }
    
    public void somethingHappened(){
       System.out.println("Called me............!");
    }
    
   
}