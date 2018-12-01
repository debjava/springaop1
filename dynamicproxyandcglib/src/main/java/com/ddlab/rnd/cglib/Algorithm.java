/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ddlab.rnd.cglib;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Algorithm {

    public void runAlgorithm() {
        System.out.println("running the algorithm");
        try {
            // do something  here - 
            // simulate some real time-consuming operation here             
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
