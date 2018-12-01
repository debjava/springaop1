package com.ddlab.rnd;

import java.util.concurrent.TimeUnit;

//public class MyThread extends Thread { //implements Runnable {

public class MyThread implements Runnable {
	
	public void run() {
		
		while(true) {
			
			try {
				TimeUnit.MILLISECONDS.sleep(500);
				System.out.println("Running...........");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
