
package com.ddlab.rnd.type1;

/**
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class CalculatorImpl implements Calculator {

    @Override
    public int calculate(int a, int b) {
//    	String s = null;
//    	if( s == null)
//    	throw new NullPointerException("Simply");
        return a/b;
    }

}
