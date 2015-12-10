import javax.swing.JOptionPane;

public class Password 
{
      public static void main(String args[]) 
      {
          int counts = 0;
          String Password = JOptionPane.showInputDialog("Create a passwords with a length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.)");
          
          for(int i = 0; i < Password.length(); i++)
          {
              
              if (Password.substring(i, i+1).equals("+") || Password.substring(i, i+1).equals("-") || Password.substring(i, i+1).equals("*") || Password.substring(i, i+1).equals("/") || Password.substring(i, i+1).equals("@"))
              {
                  counts += 1;
                }
            }
          
          if (Password.length() >= 6 && counts == 1)
              {
                  System.out.println("Accepted");
                }
          else
              {
                  System.out.println("Failed");
                }
          
    }   
}