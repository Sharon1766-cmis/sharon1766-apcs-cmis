import javax.swing.JOptionPane;

public class TestOneRetry
 {
    public static void main(String[] args)
    {
        String na = JOptionPane.showInputDialog ( "Give me an integer");
        int a=Integer.parseInt(na);
           
        double [] decimals = new double[a];
        String [] letter = new String[a];
        String [] index = new String[a];
        
        for (int i = 0; i < a; i++)
            {
              index[i] = i + ":";
              decimals[i] = (Math.random()*49+1);
              letter[i] = " ";
              
              if ( (int) decimals[i] %2 == 0)
              {
                  for (int f = 0; f < decimals[i]; f++)
                  {
                  letter[i] += "E"; 
                  }
               }  
               else
               {    
                   for (int f = 0; f < decimals[i]; f++)
                   {
                   letter[i] += "O"; 
                   }
                }    
                   
            }  
        for (int i = 0; i < a; i++)
        {
            System.out.println( index[i] + decimals[i]);
        }   
        
        int i = a-1;
        while (i >= 0)
        {
            System.out.println( index[i] + letter[i] + decimals[i]);
            i--;
        }    
             
    }     
 } 