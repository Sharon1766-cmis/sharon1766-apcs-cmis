import javax.swing.JOptionPane;

public class WeatherChaos
{
public static void main ( String[] argv )
    {
        String nInputdays = JOptionPane.showInputDialog ("How Many Days?");
        
        int Inputdays = Integer.parseInt(nInputdays);
        
        int [] days = new int [Inputdays];
        int Temp;
        int PreTemp = 0;
        int day;
        int swing;
 
        
        for ( int i = 0; i < Inputdays; i++ )
        {
            Temp = (int) (Math.random() * 200) - 100 ;
            day = i +1 ;
            swing = PreTemp;
           
           
               System.out.println(day + "   "+Temp+ "   " +swing);
               
            PreTemp = Temp;
          
        }
        
        
        }   
    }
