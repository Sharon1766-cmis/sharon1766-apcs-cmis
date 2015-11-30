import javax.swing.JOptionPane;
public class Password
{
    public static void main(String[] args)
    {
         int counts =0;
        String password=new String(JOptionPane.showInputDialog("Make a passwords with length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.)"));
        
       
      for(int i=0;i<password.length();i++)
      {
            if(password.substring(i).equals("+")||password.substring(i).equals("-")||password.substring(i).equals("*")||password.substring(i).equals("/")||password.substring(i).equals("@"))
        {
            counts+=1;// counts the entire length of password until reachs a speical character
        }
      }
      if (password.length()<6 || counts == 0)
     {
        System.out.println("Accepted!");
     }
     else
     {
        System.out.println("Failed!");
     }
    }
}