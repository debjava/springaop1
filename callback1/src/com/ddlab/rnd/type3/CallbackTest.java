package com.ddlab.rnd.type3;
public class CallbackTest extends Something {
    @Override
    public void test() {
        System.out.println("This is inside CallbackTest!");
    }

    public static void main(String[] args) {
        CallbackTest myTest = new CallbackTest();
        myTest.usingCallback();
    }    
}