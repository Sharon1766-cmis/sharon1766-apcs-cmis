  

import java.util.Scanner;

public class StringVariables {
    
    public static void main (String [] args) {
        
        Scanner user_input = new Scanner (System.in);
        
        String first_name;
        System.out.print("What is your name?");
        first_name = user_input.next ( ) ;
        
        String age;
        System.out.print ("What is your age?");
        age = user_input.next ( ) ;
        
        System.out.println ("Hello " +first_name+  ",you are " +age+ " years old " );
        
    }
    
}    
        
        