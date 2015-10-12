import javax.swing.JOptionPane;
public class senior001Driver
{
 public static void main ( String[] args )
 
    {
        senior001 senior001=new senior001();
        senior001 junior001 = new senior001( 4.0, "Bob" , "Lee", 17);
        
      System.out.println( "Senior Info:"+ senior001 );
       JOptionPane.showMessageDialog(null,junior001,  "Junior Info:",JOptionPane.PLAIN_MESSAGE );
        
    }
}
