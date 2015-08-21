
import javax.swing.JOptionPane;

public class Fundamentals
 {
    public static void main(String[] args)
    {
            
           String na = JOptionPane.showInputDialog ( "Give me a number");
           String nb = JOptionPane.showInputDialog ( "Give me another number");
           int a=Integer.parseInt(na);
           int b=Integer.parseInt(nb);
           
        if( a > b )
            { 
           System.out.println( "The value of a is " +a+ " and it is greater than b whose value is " +b +"." );
            }
        else if (a < b )
             {
           System.out.println( "The value of a is " +a+ " and it is less than b whose value is " +b+ "." );
            }
         else 
             {
           System.out.println( "The value of a is " +a+ " and it is equal than b whose value is " +b+ "." );
             }           
        }     
    }     
            