
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //objeto numberDisplay que guarda hora
    private NumberDisplay hours;
    //objeto que guarda minutos
    private NumberDisplay minutes;
    //String de 5 caracteres:hora , : , y minutos
    private String displayString;
    /**
     * Constructor objetos Clockdisplay. Crea reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
        
    }
    /**
     * Constructor objetos ClockDisplay
     * Crea nuevo reloj con los valores de los parametros dados
     */
    public ClockDisplay(int newHours, int newMinutes)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(newHours); //El objeto hours tiene el valor que el usuario mete, invocando setValue de NumberDisplay
        minutes = new NumberDisplay(60);
        minutes.setValue(newMinutes);
        updateDisplay();
        
    }
    
    /**
     * Fija unas horas y unos minutos pasados como parametros
     */
    public void setTime(int actualHour, int actualMinutes)
    {
       hours.setValue(actualHour);
       minutes.setValue(actualMinutes);
       updateDisplay();
        
    }

    
    /**
     * 
     * Hace avanzar un minuto al reloj
     */
    public void timeTick() 
    {
        minutes.increment();
        
        
        if(minutes.getValue()== 0) 
        {
           hours.increment();
        }
        
       updateDisplay();
    }

    /**
     * Muestra una cadena de 5 caracteres mostrando horas y minutos en formato 12 horas
     */
     public String getTime()
     { 
         if(hours.getValue()<12)
         {
             displayString = (hours.getDisplayValue() + ":" + minutes.getDisplayValue()+" am");
         }
         else if(hours.getValue() == 12)
         {
              displayString = (hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " pm");
         }
         else if( hours.getValue()>12)
         {
            hours.setValue(hours.getValue() - 12);
            displayString = (hours.getDisplayValue() + ":" + minutes.getDisplayValue()+ " pm");
         }
         return displayString;
     }    
     
     /**
      * Actualiza el atributo displayString
      */
     private void updateDisplay()//
    {
     
        displayString = (hours.getDisplayValue() + ":" + minutes.getDisplayValue());
    }
} 
    
    


