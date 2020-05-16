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
	//Common times - further dollar/franc duplication
	//$5 + 10 CHF = $10 if rate is 2:1
	//Money rounding?
	//hashCode()
	//Equal null
	//Equal object
	//Currency
	//
	//DONE:
	//$5 * 2 = $10
	//5 CHF * 2 = 10 CHF
	//Dollar side-effects?
	//equals()
	//Make amount private
	//Dollar/Franc duplication
	//Compare Francs with Dollars
	
    @Test public void testMultiplication() {
    	Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test public void testEquality() {
    	assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    	assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    	assertTrue(Money.franc(5).equals(Money.franc(5)));
    	assertFalse(Money.franc(5).equals(Money.franc(6)));
    	assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    
    @Test public void testFrancMultiplication() {
    	Money five = Money.franc(5);
    	assertEquals(Money.franc(10), five.times(2));
    	assertEquals(Money.franc(15), five.times(3));
    }
}
