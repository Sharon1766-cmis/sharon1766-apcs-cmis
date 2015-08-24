
import javax.swing.JOptionPane;

public class FundamentalsP3
 {
    public static void main(String[] args)
    {
            
           String na = JOptionPane.showInputDialog ( "Give me a number");

           int a=Integer.parseInt(na);
           
           int ra = a % 2; 
                                          
        if( ra == 0)
            { 
           System.out.println( a+ " is an even number." );
            }
       
         else 
             {
           System.out.println( a+ " is an odd number." );
             }           
        }     
    }     
            