package com.ddlab.rnd.dynamic.proxy;

public class CalculatorImpl implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a/b;
    }

}
