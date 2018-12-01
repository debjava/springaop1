package com.ddlab.rnd.type1;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	
	List<MyListener> listeners = new ArrayList<MyListener>();
	
    void notifiySomethingHappened(){
        for(MyListener listener : listeners) {
            listener.somethingHappened();
        }
    }

	public void addListener(MyForm myForm) {
		listeners.add(myForm);
	}

}
