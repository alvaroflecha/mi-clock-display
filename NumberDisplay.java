
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int value;
    private int limit;
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        // initialise instance variables
        value = 0;
        limit = newLimit;
    }

    /**
     *   
     */
    public void setValue(int newValue)
    {
        value = newValue;
    }
    
    public String getDisplayValue()
    {
        if(value < 10)
        {
            return "0" + value;
        }
    
        else
        {
            return "" + value;
        
        }
    }
    
    public int getValue()
    {
        return value;
    }
    
}    
