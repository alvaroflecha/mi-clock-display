
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // El valor almacenado
    private int value;
     //El limite al que puede llegar el valor
    private int limit;
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int newLimit)
    {
        value = 0;
        
        limit = newLimit;
    }

    /**
     *   Fija el valor del atributo valor a uno dado
     */
    public void setValue(int newValue)
    {   if((newValue < limit) && (newValue >=0)){
        value = newValue;
       }
        
    }
    /**
     * Devuelve por pantalla una cadena de dos caracteres con el valor del atributo value
     */
    public String getDisplayValue()
    {
        String returnedValue ="";
        if(value < 10)
        {
            returnedValue= "0" + value;
        }
    
        else
        {
            returnedValue =  "" + value;
        
        }
        return returnedValue; // intentar en cada metodo solo utilizar un return (obligatorio en junio)
    }
    /**
     * Devuelve el valor actual del atributo value
     */
    public int getValue()
    {
        return value;
    }
    /**
     * incrementa en 1 el valor de value y lo devuelve a 0 si alcanza el limite
     */
    public void increment()// tambien value = value +1
    //
    {
        if(value < (limit-1)) // value = value + 1 (mirar otra forma para hacerlo)
        {
            value = value+1;
        }
        else 
        {
            value = 0;
        }
    
    }  
}

