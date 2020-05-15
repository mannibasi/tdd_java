/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wycash;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
    //TODO:
	//Make amount private
	//$5 + 10 CHF = $10 if rate is 2:1
	//Money rounding?
	//hashCode()
	//Equal null
	//Equal object
	//
	//DONE:
	//$5 * 2 = $10
	//Dollar side-effects?
	//equals()
	
    @Test public void testMultiplication() {
    	Dollar five = new Dollar(5);
    	Dollar product = five.times(2); 
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }
    
    @Test public void testEquality() {
    	assertTrue(new Dollar(5).equals(new Dollar(5)));
    	assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
