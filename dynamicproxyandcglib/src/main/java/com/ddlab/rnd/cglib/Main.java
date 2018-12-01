/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ddlab.rnd.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Main {
    public static void main(String[] args) {
        // 1. create the 'real' object
        Algorithm alg = new Algorithm();
        // 2. create the proxy
        Algorithm  proxifiedAlgorithm = createProxy(alg);
        // 3. execute the proxy - as we see it has the same API as the real object
        proxifiedAlgorithm.runAlgorithm();
    }
    // given the obj, creates its proxy
    // the method is generified - just to avoid downcasting...
    public static <T> T createProxy(T obj) {
        // this is the main cglib api entry-point
        // this object will 'enhance' (in terms of CGLIB) with new capabilities
        // one can treat this class as a 'Builder' for the dynamic proxy
        Enhancer e = new Enhancer();

        // the class will extend from the real class
        e.setSuperclass(obj.getClass());
        // we have to declare the interceptor  - the class whose 'intercept'
        // will be called when any method of the proxified object is called.
        e.setCallback(new MyInterceptor(obj));
        // now the enhancer is configured and we'll create the proxified object
        T proxifiedObj = (T) e.create();
        // the object is ready to be used - return it
        return proxifiedObj;
    }
}
