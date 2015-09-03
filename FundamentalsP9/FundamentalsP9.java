
import javax.swing.JOptionPane;

public class FundamentalsP9
 {
    public static void main(String[] args)
    {
            
           String username = JOptionPane.showInputDialog ( "What is the username");
           String npassword = JOptionPane.showInputDialog ( "What is the password");

           int password=Integer.parseInt(npassword);
      
                
           if ( username.equals("sharon1766")&& password == 1766 )
           
            {
            System.out.println(" You have successfully logged in");
             }
             else
             {
                 System.out.println("Login unsuccessful..try again");
             }     
    }   
}
            