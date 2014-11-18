
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String currentTime;
    /**
     * Constructor objetos Clockdisplay. Crea reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        currentTime = (hours.getDisplayValue() + ":" + minutes.getDisplayValue());
        
    }
    /**
     * Constructor objetos ClockDisplay
     * Crea nuevo reloj con los valores de los parametros
     */
    public ClockDisplay(int hours2, int minutes2)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(hours2);
        minutes = new NumberDisplay(60);
        minutes.setValue(minutes2);
        currentTime = (hours.getDisplayValue() + ":" + minutes.getDisplayValue());
        
    }
    
    /**
     * Fija unas horas y unos minutos pasados como parametros
     */
    public void setTime(int newHours, int newMinutes)
    {
       hours.setValue(newHours);
       minutes.setValue(newMinutes);
        
    }

    
    /**
     * 
     * Hace avanzar un minuto al reloj
     */
    public void timeTick() 
    {
        minutes.increment();
        
        if(minutes.value == 00)
        {
            hours.increment();
        }
       
    }

    /**
     * Muestra una cadena de 5 caracteres mostrando horas y minutos
     */
     public String getTime()
     { 
         String currentTime = (hours.getDisplayValue() + ":" + minutes.getDisplayValue());
         return currentTime;
     }    
} 
    
    


