
import javax.swing.JOptionPane;
public class ClockDriver
{
 public static void main ( String[] args )
 
    {
        
        String na = JOptionPane.showInputDialog ( "Hour");
        String nb = JOptionPane.showInputDialog ( "Mins?");
        String nc = JOptionPane.showInputDialog ( "Secs");
        int a=Integer.parseInt(na);
        int b=Integer.parseInt(nb);
        int c=Integer.parseInt(nc);
           
        Clock KitchenClock=new Clock();
        Clock BedroomClock = new Clock( a,  b, c);
        
        System.out.println(KitchenClock);
        System.out.println( BedroomClock);
        
    }
}
