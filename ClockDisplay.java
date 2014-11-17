
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
    private String horaActual;
    
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        horaActual = "00:00";
        
        
    }
    
    public ClockDisplay(int newHours, int newMinutes)
    {   
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        horaActual = newHours + ":" + newMinutes;
        
    }
    
    /**
     * Fija unas horas y unos minutos pasados como parametros
     */
    public void setTime(int newHours, int newMinutes)
    {
        if((newHours < 24) && (newHours >= 0)&&(newMinutes < 60) && (newMinutes >= 0)){
            
            horaActual = newHours + ":"+ newMinutes;
        
    }
    
    
   
    
    
}
}
