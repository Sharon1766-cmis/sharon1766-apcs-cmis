
import javax.swing.JOptionPane;
public class ClockDriver
{
 public static void main ( String[] args )
 
    {
        
        String nHour = JOptionPane.showInputDialog ( "Hour");
        String nMins = JOptionPane.showInputDialog ( "Mins?");
        String nSecs = JOptionPane.showInputDialog ( "Secs");
        int Hour=Integer.parseInt(nHour);
        int Mins=Integer.parseInt(nMins);
        int Secs=Integer.parseInt(nSecs);
           
        Clock KitchenClock=new Clock();
        Clock BedroomClock = new Clock( Hour,  Mins, Secs);
        
      
        
        System.out.println( KitchenClock);
        System.out.println( BedroomClock);
        
    }
}
