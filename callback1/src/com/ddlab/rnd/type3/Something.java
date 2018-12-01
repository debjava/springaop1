package com.ddlab.rnd.type3;
public abstract class Something {   
    public abstract void test();        
    public void usingCallback() {
        System.out.println("This is before callback method");
        test();
        System.out.println("This is after callback method");
    }
}