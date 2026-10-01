
/**
 * An adaptation from the NumberDisplay class found in
 * Objects First, chapter 3. The adaptation limits the 
 * functionality here to simply dealing with the numbers
 * and their rollovers, leaving the display to a different
 * class. 
 *
 * @author Barnes & Kolling 
 * @author Jason Oswald
 * @version 20260929
 */

public class NumberWheel {
    private int limit;
    private int value;
    
    public NumberWheel( int rollOverLimit ) {
        limit = rollOverLimit;
        value = 0;
    }
    
    public int getValue() { return value; }
    public void setValue( int newValue ) {
        if( newValue >= 0 && newValue < limit ) {
            value = newValue;
        }
    }
    
    public void increment() {
        value++;
        if( value == limit ) {
            value = 0;
        }
    }
    
}