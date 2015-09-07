
import javax.swing.JOptionPane;

public class TestOne
 {
    public static void main(String[] args)
    {
            
           String na = JOptionPane.showInputDialog ( "Give me an integer");

           int a=Integer.parseInt(na);
           
            int [] array = new int[a];
            
            int index = 0;
                                
            while (  index<= a)
            
            {
                if  (index < a)
                {
                 double i =( 50*Math.random());      
                    
                    System.out.println("["+index+"]" + i );
                    index ++;
                }   
               
                }    
           }     
    } 
