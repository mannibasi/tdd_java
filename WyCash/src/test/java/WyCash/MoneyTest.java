/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package WyCash;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    @Test public void testMultiplication() {
        //TODO:
    	//Dollar side-effects?
    	//$5 + 10 CHF = $10 if rate is 2:1
    	//Make amount private
    	//Money rounding?
    	//
    	//DONE:
    	//$5 * 2 = $10
    	Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }
}
