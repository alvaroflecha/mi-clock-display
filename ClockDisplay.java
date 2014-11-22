
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
    //String de 9 caracteres:hora , : , minutos, dia, / , mes , / , año
    private String displayString;
    //objeto numberDisplay que guarda años
    private NumberDisplay year;
    //objeto numberDisplay que guarda meses
    private NumberDisplay month;
    //objeto numberDisplay que guarda dias
    private NumberDisplay day;
    
    
    /**
     * Constructor objetos Clockdisplay. Crea reloj a 00:00
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(99);
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
     * Crea nuevo reloj que incluye fecha
     */
    public ClockDisplay( int newHours, int newMinutes, int newYear, int newMonth, int newDay)
    {   
        hours = new NumberDisplay(24);
        hours.setValue(newHours); //El objeto hours tiene el valor que el usuario mete, invocando setValue de NumberDisplay
        minutes = new NumberDisplay(60);
        minutes.setValue(newMinutes);
        day = new NumberDisplay(31);
        day.setValue(newDay);
        month = new NumberDisplay(13);
        month.setValue(newMonth);
        year = new NumberDisplay(99);
        year.setValue(newYear);
        updateDisplay();
        
    }
    
    /**
     * Fija unas horas, minutos  y fecha pasados como parametros
     */
    public void setTime(int actualHour, int actualMinutes, int actualDay, int actualMonth, int actualYear)
    {
       hours.setValue(actualHour);
       minutes.setValue(actualMinutes);
       day.setValue(actualDay);
       month.setValue(actualMonth);
       year.setValue(actualYear);
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
        
           if(hours.getValue() == 0)
           {
               day.increment();
        
               if(day.getValue() == 0)
               {
                    month.increment();
                    day.increment();
                    if(month.getValue() == 0)
                    {
                        year.increment();
                        month.increment();
                    }
               }
           }
        } 
       updateDisplay();
    }

    /**
     * Muestra una cadena de 9 caracteres mostrando horas y minutos en formato 12 horas, e incluye la fecha
     */
     public String getTime()
     { 
        return displayString;
     }    
     
     /**
      * Actualiza el atributo displayString
      */
     
    
       public void updateDisplay()
    {
        int actualHour = hours.getValue();
        String displayedHour = "";
        String amPm = "";   
        boolean isMorning = true;
        
        if (actualHour == 0) 
        {
            displayedHour = "12";
            isMorning = true;
        }
        else if (actualHour < 10)
        {
            displayedHour = "0" + actualHour;
            isMorning = true;            
        }
        else if (actualHour < 12)
        {
            displayedHour = "" + actualHour;
            isMorning = true;            
        }
        else if (actualHour == 12)
        {
            displayedHour = "12";
            isMorning = false;
        }
        else if (actualHour < 22)
        {
            displayedHour = "0" + (actualHour - 12);
            isMorning = false;
        }
        else {
            displayedHour = "" + (actualHour- 12);
            isMorning = false;
        }
        
 
        if (isMorning) {
            amPm = "am";
        }
        else {
            amPm = "pm";
        }
        
        displayString = displayedHour + ":" +  minutes.getDisplayValue() + amPm + " " + day.getDisplayValue() + "/" + month.getDisplayValue() + "/" + year.getDisplayValue();
    }
    
}
    
    


