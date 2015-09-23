import javax.swing.JOptionPane;

public class WeatherChaos
{
public static void main ( String[] argv )
    {
        String nInputdays = JOptionPane.showInputDialog ("How Many Days?");
        
        int Inputdays = Integer.parseInt(nInputdays);
        
        int [] days = new int [Inputdays];
        int Temp;
        int day;
 
        
        for ( int i = 0; i < Inputdays; i++ )
        {
            Temp = (int) (Math.random() * 200) - 100 ;
            //System.out.println(Temp);
        }
        
        
        }   
    }
