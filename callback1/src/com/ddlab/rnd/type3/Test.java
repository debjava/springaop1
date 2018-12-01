package com.ddlab.rnd.type3;

public class Test {
	
	public static void main(String[] args) {

		Caller caller = new Caller();

		Fruit apple = new Apple(); // Apple version of Fruit

		Fruit banana = new Banana(); // Banana version of Fruit

		caller.register(apple); // displays "Callback - Apple"

		caller.register(banana); // displays "Callback - Banana"

		}




}
